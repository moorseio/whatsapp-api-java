package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.Utils.Constants;
import io.moorse.demo.whatsapp.api.moorse.MoorseMessageApi;
import io.moorse.demo.whatsapp.api.moorse.dto.MessageFileRequest;
import io.moorse.demo.whatsapp.api.moorse.dto.MessageRequest;
import io.moorse.demo.whatsapp.models.*;
import io.moorse.demo.whatsapp.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BotServiceImpl implements BotService{

  @Value("${moorse.integration.number}")
  private String from;

  private final MoorseMessageApi moorseMessageApi;

  private final ProductServiceImpl productService;

  private final MenuService menuService;

  private final UsersRepository usersRepository;

  public BotServiceImpl(MoorseMessageApi moorseMessageApi, ProductServiceImpl productService, MenuService menuService, UsersRepository usersRepository) {
    this.moorseMessageApi = moorseMessageApi;
    this.productService = productService;
    this.menuService = menuService;
    this.usersRepository = usersRepository;
  }

  @Override
  public void receiveMessage(Message message) {

    Users user = handleUser(message.getContactUser());
    Product productActual = productService.getActualProduct(user);
    Menu actualMenu = productActual.getMenu();
    Menu nextMenu = menuService.getNextMenu(productActual, message.getContent());

    productActual = handleSelectedOption(productActual, actualMenu, nextMenu, message.getContent());
    processResponseUser(user, message.getContent(), actualMenu, nextMenu, productActual);

  }

  private void processResponseUser(Users user, String optionSelected, Menu actualMenu, Menu nextMenu, Product product) {
    boolean finish = actualMenu.isInitial() && actualMenu.isFinishMenu(optionSelected);
    if (finish) {
      handleFinish(user.getNumber(), product);
    } else {
      if (nextMenu.isInitial() && actualMenu.isInitial()) {
        sendMessageInitial(user.getNumber(), user.getName(), nextMenu.getMenuData());
      } else {
        sendMessage(user.getNumber(), nextMenu.getMenuData());
      }
    }
  }

  private Product handleSelectedOption(Product productActual, Menu actualMenu, Menu nextMenu , String option) {
    Item itemSelected = actualMenu.getItemSelected(option);
    productActual.setMenu(nextMenu);
    return  productService.addItemProduct(productActual, itemSelected);
  }

  private void handleFinish(String to, Product productActual){
    sendMessage(to, productActual.toString());
    productService.finishProduct(productActual);
  }

  private Users handleUser(Users user) {
    Users userBd = usersRepository.findByNumber(user.getNumber());
    if (userBd == null) {
      userBd = usersRepository.save(user);
    }
    return userBd;
  }

  private void sendMessage(String to, String content){
    MessageRequest messageRequest = new MessageRequest(from, to, content);
    moorseMessageApi.sendMessage(messageRequest);
  }

  private void sendMessageInitial(String to, String userName, String content){
    MessageFileRequest messageRequest = new MessageFileRequest(from, to);
    messageRequest.setBody(Constants.IMAGE_INITIAL);
    messageRequest.setFilename(Constants.FILE_NAME_INITIAL);

    StringBuilder msg = new StringBuilder();
    msg.append(String.format(Constants.WELCOME_USER,userName));
    msg.append(Constants.WELCOME_BOT);
    msg.append(content);
    messageRequest.setCaption(msg.toString());

    moorseMessageApi.sendFile(messageRequest);
  }


}

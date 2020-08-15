package io.moorse.demo.whatsapp.config;

import io.moorse.demo.whatsapp.Utils.Constants;
import io.moorse.demo.whatsapp.Utils.ItemType;
import io.moorse.demo.whatsapp.api.moorse.MoorseLoginApi;
import io.moorse.demo.whatsapp.api.moorse.dto.DataResponse;
import io.moorse.demo.whatsapp.api.moorse.dto.LoginRequest;
import io.moorse.demo.whatsapp.models.Item;
import io.moorse.demo.whatsapp.models.Menu;
import io.moorse.demo.whatsapp.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigInit {

  @Value("${moorse.login}")
  private String login;

  @Value("${moorse.senha}")
  private String senha;

  public void login(MoorseLoginApi loginApi) {
    DataResponse dataResponse = loginApi.login(new LoginRequest(login, senha));
    Constants.TOKEN  = dataResponse.getData();
  }

  @Bean
  public CommandLineRunner init(MenuRepository menuRepository, MoorseLoginApi loginApi) {
    return (args) -> {

      // Menu Inicial
      Menu menuInicial = new Menu("INICIAL");
      Menu menuSabores = new Menu("SABORES");
      Menu menuMassas = new Menu("MASSAS");
      Menu menuAdicionais = new Menu("ADICIONAIS");
      Menu menuFinalizar = new Menu("FINALIZAR");

      menuInicial.setInitial(true);
      menuInicial = menuRepository.save(menuInicial);
      menuSabores = menuRepository.save(menuSabores);
      menuMassas = menuRepository.save(menuMassas);
      menuAdicionais = menuRepository.save(menuAdicionais);


      List<Item> itensMenuInicial = new ArrayList<Item>();
      itensMenuInicial.add(new Item("Para escolher sua pizza", ItemType.MENU.name(), 1, menuSabores));
      itensMenuInicial.add(new Item("Para escolher o tipo de massa", ItemType.MENU.name(), 2, menuMassas));
      itensMenuInicial.add(new Item("Para escolher os adicionais", ItemType.MENU.name(), 3, menuAdicionais));
      itensMenuInicial.add(new Item("Finalizar Pedido", ItemType.MENU.name(), 4, menuInicial));

      menuInicial.setItems(itensMenuInicial);
      menuRepository.save(menuInicial);

      // Menu Sabores
      List<Item> itensMenuSabores = new ArrayList<Item>();
      itensMenuSabores.add(new Item("🍗 Frango", ItemType.ITEM.name(), 1, menuInicial));
      itensMenuSabores.add(new Item("🥩 Calabresa", ItemType.ITEM.name(), 2, menuInicial));
      itensMenuSabores.add(new Item("🍳 Portugues", ItemType.ITEM.name(), 3, menuInicial));

      menuSabores.setItems(itensMenuSabores);
      menuRepository.save(menuSabores);


      // Menu Massas
      List<Item> itensMenuMassas = new ArrayList<Item>();
      itensMenuMassas.add(new Item(" 🥖 Fina", ItemType.ITEM.name(), 1, menuInicial));
      itensMenuMassas.add(new Item(" 🍞 Grossa", ItemType.ITEM.name(), 2, menuInicial));
      itensMenuMassas.add(new Item(" 🍫 Recheada", ItemType.ITEM.name(), 3, menuInicial));

      menuMassas.setItems(itensMenuMassas);
      menuRepository.save(menuMassas);


      // Menu adicionais
      List<Item> itensMenuAdicionais = new ArrayList<Item>();
      itensMenuAdicionais.add(new Item(" 🥓 Bacon", ItemType.ITEM.name(), 1, menuInicial));
      itensMenuAdicionais.add(new Item(" 🧀 Queijo", ItemType.ITEM.name(), 2, menuInicial));
      itensMenuAdicionais.add(new Item(" 🥗 Legumes", ItemType.ITEM.name(), 3, menuInicial));

      menuAdicionais.setItems(itensMenuAdicionais);
      menuRepository.save(menuAdicionais);

      login(loginApi);

    };
  }
}

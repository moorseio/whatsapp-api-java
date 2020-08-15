package io.moorse.demo.whatsapp.controllers;

import com.google.gson.Gson;
import io.moorse.demo.whatsapp.Utils.ReponseType;
import io.moorse.demo.whatsapp.models.Message;
import io.moorse.demo.whatsapp.service.BotService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/webhooks", produces = MediaType.APPLICATION_JSON_VALUE)
public class WebhooksController {

  private final BotService botService;

  public WebhooksController(BotService botService){
    this.botService = botService;
  }

  @PostMapping()
  public void whatsappWebhook(@RequestBody String json) {
    Message message = new Gson().fromJson(json, Message.class);
    System.out.println(message.toString());
    if (message.getStatus().equals(ReponseType.RESPONDIDA.toString())) {
      botService.receiveMessage(message);
    }
  }

}

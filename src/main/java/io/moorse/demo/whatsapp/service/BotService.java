package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.models.Message;

public interface BotService {

    public void receiveMessage(Message message);

}

package io.moorse.demo.whatsapp.api.moorse;

import io.moorse.demo.whatsapp.api.moorse.dto.MessageFileRequest;
import io.moorse.demo.whatsapp.api.moorse.dto.MessageRequest;
import io.moorse.demo.whatsapp.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "MoorseMessageApi", url = "${moorse.api.url}", configuration = FeignConfiguration.class)
public interface MoorseMessageApi {

    @PostMapping(path = "/v2/whatsapp/send-message")
    public void sendMessage(@RequestBody MessageRequest message);

    @PostMapping(path = "/v2/whatsapp/send-file")
    public void sendFile(@RequestBody MessageFileRequest message);

}

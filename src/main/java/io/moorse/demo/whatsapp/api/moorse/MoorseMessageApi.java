package io.moorse.demo.whatsapp.api.moorse;

import io.moorse.demo.whatsapp.api.moorse.dto.MessageFileRequest;
import io.moorse.demo.whatsapp.api.moorse.dto.MessageRequest;
import io.moorse.demo.whatsapp.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@FeignClient(value = "MoorseMessageApi", url = "${moorse.api.url}", configuration = FeignConfiguration.class)
public interface MoorseMessageApi {

    @PostMapping(path = "/v2/whatsapp/{integrationId}/send-message")
    public void sendMessage(@PathVariable UUID integrationId, @RequestBody MessageRequest message);

    @PostMapping(path = "/v2/whatsapp/{integrationId}/send-file")
    public void sendFile(@PathVariable UUID integrationId, @RequestBody MessageFileRequest message);

}

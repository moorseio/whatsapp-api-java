package io.moorse.demo.whatsapp.api.moorse;

import io.moorse.demo.whatsapp.api.moorse.dto.MessageFileRequest;
import io.moorse.demo.whatsapp.api.moorse.dto.MessageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "MoorseMessageApi", url = "${moorse.api.url}")
public interface MoorseMessageApi {
	
    @PostMapping(path = "/api/v2/whatsApp/sendMessage")
    public void sendMessage(@RequestBody MessageRequest message);

    @PostMapping(path = "/api/v2/whatsApp/sendFile")
    public void sendFile(@RequestBody MessageFileRequest message);
    
}

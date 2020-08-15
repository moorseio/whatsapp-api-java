package io.moorse.demo.whatsapp.api.moorse;

import io.moorse.demo.whatsapp.api.moorse.dto.DataResponse;
import io.moorse.demo.whatsapp.api.moorse.dto.LoginRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "MoorseLoginApi", url = "${moorse.api.url}")
public interface MoorseLoginApi {
	
    @PostMapping(path = "/oauth/login")
    public DataResponse login(@RequestBody LoginRequest login);
    
}

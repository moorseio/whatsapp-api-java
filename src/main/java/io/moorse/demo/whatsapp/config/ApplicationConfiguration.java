package io.moorse.demo.whatsapp.config;

import io.moorse.demo.whatsapp.Utils.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import feign.RequestInterceptor;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public RequestInterceptor requestTokenBearerInterceptor() {
		return requestTemplate -> 
			requestTemplate.header(HttpHeaders.AUTHORIZATION, "Bearer " + Constants.TOKEN);
	}
}

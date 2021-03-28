package io.moorse.demo.whatsapp.config;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import io.moorse.demo.whatsapp.Utils.Constants;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.apache.commons.io.IOUtils;

import java.nio.charset.Charset;

public class FeignConfiguration {

    @Value("${moorse.token}")
    private String token;

    @Bean
    public RequestInterceptor requestTokenBearerInterceptor() {
        return requestTemplate -> requestTemplate.header(HttpHeaders.AUTHORIZATION, token);
    }


    @Bean
    public ErrorDecoder errorDecoder() {
        return (methodKey, response) -> {

            int status = response.status();

            if (status == 400) {

                String body = "Bad request";

                try {
                    body = IOUtils.toString(response.body().asReader(Charset.defaultCharset()));
                } catch (Exception ignored) {
                }

                HttpHeaders httpHeaders = new HttpHeaders();
                response.headers().forEach((k, v) -> httpHeaders.add("feign-" + k, StringUtils.join(v, ',')));


                return new RuntimeException("Response Code " + status);
            } else {
                return new RuntimeException("Response Code " + status);
            }
        };
    }

}

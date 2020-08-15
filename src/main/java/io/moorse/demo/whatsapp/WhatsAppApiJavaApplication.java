package io.moorse.demo.whatsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;
import java.net.InetAddress;

@SpringBootApplication
@EnableFeignClients
public class WhatsAppApiJavaApplication {

  public static void main(String[] args) throws Throwable {
    Logger logger = LoggerFactory.getLogger(WhatsAppApiJavaApplication.class);
    SpringApplication app = new SpringApplication(WhatsAppApiJavaApplication.class);
    Environment env = app.run(args).getEnvironment();
    logger.info("\n----------------------------------------------------------\n\t" +
        "WhatsApp Api Java está rodando! Acesse uma das URLs:\n\t" +
        "Local: \t\thttp://localhost:{}\n\t" +
        "Externa: \thttp://{}:{}\n----------------------------------------------------------",
      env.getProperty("server.port"),
      InetAddress.getLocalHost().getHostAddress(),
      env.getProperty("server.port"));
  }

}

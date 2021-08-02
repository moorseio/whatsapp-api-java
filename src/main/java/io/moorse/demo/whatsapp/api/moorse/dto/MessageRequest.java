package io.moorse.demo.whatsapp.api.moorse.dto;

public class MessageRequest {

  private String to;
  private String body;


  public MessageRequest() {
  }

  public MessageRequest(String to, String body) {
    this.to = to;
    this.body = body;
  }


  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

}

package io.moorse.demo.whatsapp.api.moorse.dto;

public class MessageFileRequest {

  private String to;
  private String body;

  private String filename;
  private String caption;

  public MessageFileRequest() {
  }

  public MessageFileRequest(String to, String body) {
    this.to = to;
    this.body = body;
  }

  public MessageFileRequest(String to) {
    this.to = to;
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

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }
}

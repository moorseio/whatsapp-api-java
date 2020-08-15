package io.moorse.demo.whatsapp.api.moorse.dto;

public class DataResponse {
  private String data;
  private String[] errors;

  public DataResponse() {
  }

  public DataResponse(String data, String[] errors) {
    this.data = data;
    this.errors = errors;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String[] getErrors() {
    return errors;
  }

  public void setErrors(String[] errors) {
    this.errors = errors;
  }
}

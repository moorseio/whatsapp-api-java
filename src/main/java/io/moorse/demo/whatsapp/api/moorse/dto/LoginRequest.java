package io.moorse.demo.whatsapp.api.moorse.dto;

public class LoginRequest {

  private String login;
  private String senha;

  public LoginRequest() {
  }

  public LoginRequest(String login, String senha) {
    this.login = login;
    this.senha = senha;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}

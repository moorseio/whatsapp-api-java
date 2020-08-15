package io.moorse.demo.whatsapp.models;

import com.sun.istack.NotNull;
import io.moorse.demo.whatsapp.Utils.Constants;
import io.moorse.demo.whatsapp.Utils.ProductStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  private ProductStatus status;

  @NotNull
  @ManyToOne
  private Users users;

  @NotNull
  @ManyToOne
  private Menu menu;

  @ManyToMany
  private List<Item>  items;

  protected Product() {}

  public Product(ProductStatus status, Users users, Menu menu) {
    this.status = status;
    this.users = users;
    this.menu = menu;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public List<Item> getItems() {
    if (items == null)
      this.items = new ArrayList<>();
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("*Seu pedido atual:* " + Constants.BREAK_LINE);
    res.append(items.stream().map(item ->  item.getName() + Constants.BREAK_LINE).reduce("", String::concat));
    return res.toString();
  }
}
package io.moorse.demo.whatsapp.models;

import io.moorse.demo.whatsapp.Utils.Constants;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Menu {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name;
  private LocalDateTime created;
  private LocalDateTime updated;
  private Boolean initial = false;

  @ManyToMany(cascade = CascadeType.ALL)
  private List<Item> items;

  protected Menu() {}

  public Menu(String name) {
    this.name = name;
    this.created = LocalDateTime.now();
  }

  public Menu(String name, List<Item> items) {
    this.name = name;
    this.items = items;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Boolean getInitial() {
    return initial;
  }

  public void setInitial(Boolean initial) {
    this.initial = initial;
  }

  public Boolean isInitial() {
    return initial;
  }

  public String getMenuData(){
    return items.stream().map(item ->  item.getPosition() + " - " +  item.getName() + Constants.BREAK_LINE).reduce("", String::concat);
  }

  public Item getItemSelected(Integer option){
    return items.stream().filter(item ->  item.getPosition().equals(option)).findAny().orElse(null);
  }

  public Item getItemSelected(String option){
    try {
      return getItemSelected(Integer.parseInt(option));
    } catch (Exception e){ }
    return null;
  }

  public Boolean isFinishMenu(Integer option){
    return option == items.get(items.size() - 1).getPosition();
  }

  public Boolean isFinishMenu(String option){
    try {
      return isFinishMenu(Integer.parseInt(option));
    } catch (Exception e){ }
    return false;
  }


}
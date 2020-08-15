package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.models.Menu;
import io.moorse.demo.whatsapp.models.Product;
import io.moorse.demo.whatsapp.models.Users;

public interface MenuService {

  Menu getActualMenu(Users user);
  Menu getNextMenu(Product product, String option);

}

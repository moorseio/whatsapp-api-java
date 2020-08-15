package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.models.Item;
import io.moorse.demo.whatsapp.models.Product;
import io.moorse.demo.whatsapp.models.Users;

public interface ProductService {

  Product getActualProduct(Users user);
  Product addItemProduct(Product product, Item itemSelected);
  Product finishProduct(Product product);

}

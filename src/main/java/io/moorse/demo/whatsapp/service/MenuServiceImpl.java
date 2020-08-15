package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.models.Item;
import io.moorse.demo.whatsapp.models.Menu;
import io.moorse.demo.whatsapp.models.Product;
import io.moorse.demo.whatsapp.models.Users;
import io.moorse.demo.whatsapp.repository.MenuRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

  private final ProductServiceImpl productService;

  private final MenuRepository menuRepository;

  public MenuServiceImpl(ProductServiceImpl productService, MenuRepository menuRepository) {
    this.productService = productService;
    this.menuRepository = menuRepository;
  }

  @Override
  public Menu getActualMenu(Users user) {
    Product product = productService.getActualProduct(user);
    return product.getMenu();
  }

  @Override
  public Menu getNextMenu(Product product, String option) {
    Menu menu = product.getMenu();
    Item item  = menu.getItemSelected(option);
    if (item != null ) {
      menu = item.getMenu();
    }
    return menu;
  }

}

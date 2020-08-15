package io.moorse.demo.whatsapp.service;

import io.moorse.demo.whatsapp.Utils.ItemType;
import io.moorse.demo.whatsapp.Utils.ProductStatus;
import io.moorse.demo.whatsapp.models.Item;
import io.moorse.demo.whatsapp.models.Product;
import io.moorse.demo.whatsapp.models.Users;
import io.moorse.demo.whatsapp.repository.MenuRepository;
import io.moorse.demo.whatsapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  private final MenuRepository menuRepository;

  public ProductServiceImpl(ProductRepository productRepository, MenuRepository menuRepository) {
    this.productRepository = productRepository;
    this.menuRepository = menuRepository;
  }

  @Override
  public Product getActualProduct(Users user) {
    Product product = productRepository.findByStatusAndUsersId(ProductStatus.OPEN, user.getId())
      .orElse(new Product(ProductStatus.OPEN, user, menuRepository.findByInitial(true)));
    if (product.getId() == null) {
      productRepository.save(product);
    }
    return product;
  }

  @Override
  public Product addItemProduct(Product product , Item itemSelected) {
    if(itemSelected != null && itemSelected.getType().equals(ItemType.ITEM.name())){
      product.getItems().add(itemSelected);
    }
    return productRepository.save(product);
  }

  @Override
  public Product finishProduct(Product product) {
    product.setStatus(ProductStatus.CLOSE);
    return productRepository.save(product);
  }
}

package io.moorse.demo.whatsapp.repository;

import io.moorse.demo.whatsapp.Utils.ProductStatus;
import io.moorse.demo.whatsapp.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

  Optional<Product> findByStatusAndUsersId(ProductStatus status, Long idUser);

}
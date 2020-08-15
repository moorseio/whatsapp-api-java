package io.moorse.demo.whatsapp.repository;

import io.moorse.demo.whatsapp.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Item, Long> {

  Item findById(long id);
  
}
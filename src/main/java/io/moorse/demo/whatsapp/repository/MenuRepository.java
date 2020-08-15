package io.moorse.demo.whatsapp.repository;

import io.moorse.demo.whatsapp.models.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Long> {

  Menu findById(long id);
  Menu findByInitial(boolean initial);

}
package io.moorse.demo.whatsapp.repository;

import io.moorse.demo.whatsapp.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

  Users findById(long id);
  Users findByNumber(String number);

}
package com.bootmvc.repository;

import org.springframework.data.repository.CrudRepository;
import com.bootmvc.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

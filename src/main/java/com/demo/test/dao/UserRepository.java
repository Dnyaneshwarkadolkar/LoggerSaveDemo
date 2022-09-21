package com.demo.test.dao;

//import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.test.model.User;
@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}

package com.github.aitooor.repository;

import com.github.aitooor.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

    ArrayList<UserModel> findByName(String name);
    ArrayList<UserModel> findBySurname(String surname);
    ArrayList<UserModel> findByPriority(Integer priority);
}

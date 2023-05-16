package com.github.aitooor.service;

import com.github.aitooor.model.UserModel;
import com.github.aitooor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired UserRepository userRepository;

    public ArrayList<UserModel> getUser(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    public Optional<UserModel> userById(Long id){
        return userRepository.findById(id);
    }

    public ArrayList<UserModel> userByName(String name) {
        return userRepository.findByName(name);
    }

    public ArrayList<UserModel> userBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }


    public ArrayList<UserModel> userByPriority(Integer priority) {
        return userRepository.findByPriority(priority);
    }

    public boolean deleteUser(Long id) {
        try{
            userRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}

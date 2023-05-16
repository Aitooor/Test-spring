package com.github.aitooor.controller;

import com.github.aitooor.model.UserModel;
import com.github.aitooor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUser(){
        return userService.getUser();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping( path = "/{id}")
    public Optional<UserModel> userById(@PathVariable("id") Long id) {
        return this.userService.userById(id);
    }

    @GetMapping("/name")
    public ArrayList<UserModel> userByName(@RequestParam("name") String name){
        return this.userService.userByName(name);
    }

    @GetMapping("/surname")
    public ArrayList<UserModel> userBySurname(@RequestParam("surname") String surname){
        return this.userService.userBySurname(surname);
    }

    @GetMapping("/priority")
    public ArrayList<UserModel> userByPriority(@RequestParam("priority") Integer priority){
        return this.userService.userByPriority(priority);
    }

    @DeleteMapping( path = "/{id}")
    public String removeUserById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if (ok){
            return "User removed with id " + id;
        }else{
            return "Can't remove user with id" + id;
        }
    }

}

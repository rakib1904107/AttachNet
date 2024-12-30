package com.example.AttachNet.controller;

import com.example.AttachNet.model.User;
import com.example.AttachNet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @PutMapping("users")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping("users/{uid}")
    public void deleteUser(@PathVariable int uid){
        service.deleteUser(uid);
    }
}

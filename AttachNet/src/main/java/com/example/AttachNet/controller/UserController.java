package com.example.AttachNet.controller;

import com.example.AttachNet.dto.UserDto;
import com.example.AttachNet.model.User;
import com.example.AttachNet.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>>getUsers(){
        List<UserDto> users=service.getUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userDto ){
        UserDto addUser=service.addUser(userDto);
        return ResponseEntity.ok(addUser);
    }

    @PutMapping("/users/{uid}")
    public ResponseEntity<User> updateUser(@PathVariable int uid, @RequestBody User user){
        User updatedUser=service.updateUser(uid,user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{uid}")
    public ResponseEntity<Optional<User>> deleteUser(@PathVariable int uid){

        Optional<User> deleteUser=service.deleteUser(uid);
        return ResponseEntity.ok(deleteUser);
    }
}

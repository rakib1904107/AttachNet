package com.example.AttachNet.controller;

import com.example.AttachNet.dto.LoginRequestDto;
import com.example.AttachNet.dto.UserDto;
import com.example.AttachNet.model.User;
import com.example.AttachNet.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController

public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/users")
    public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userDto ){
        UserDto addUser=service.addUser(userDto);
        return ResponseEntity.ok(addUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequestDto loginRequest){
        try{
            UserDto user=service.userLogin(loginRequest.getEmail(), loginRequest.getPassword());
            return ResponseEntity.ok().
                    body(createResponse("Login Successful",user));
        }  catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(createErrorResponse("Login Failed", e.getMessage()));
        }

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>>getUsers(){
        List<UserDto> users=service.getUsers();
        return ResponseEntity.ok(users);
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

    private Map<String, Object> createResponse(String message, Object data) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", message);
        response.put("data", data);
        return response;
    }

    private Map<String, Object> createErrorResponse(String message, Object errors) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "error");
        response.put("message", message);
        response.put("errors", errors);
        return response;
    }
}

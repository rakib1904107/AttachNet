package com.example.AttachNet.service;

import com.example.AttachNet.model.User;
import com.example.AttachNet.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

//    List<User> users= new ArrayList<>(Arrays.asList(
//            new User(1904107,"Rakib","rakib@gmail.com",19,1518363739),
//            new User(1904107,"Rakib","rakib@gmail.com",19,1518363739),
//            new User(1904107,"Rakib","rakib@gmail.com",19,1518363739)));

    public List<User> getUsers(){
        return repo.findAll();
    }

    public void addUser(User user){
        repo.save(user);
    }

    public void updateUser(User user){
        repo.save(user);
    }

    public void deleteUser(int uid){
        repo.deleteById(uid);
    }
}

package com.example.AttachNet.service;

import com.example.AttachNet.dto.UserDto;
import com.example.AttachNet.model.User;
import com.example.AttachNet.repository.UserRepo;
import com.example.AttachNet.utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    @Autowired
    private UserMapper userMapper;

    public List<UserDto> getUsers() {
        List<User> users=repo.findAll();
        return userMapper.convertToDTOList((users));
    }

    public UserDto addUser(UserDto userDto) {
        User user=userMapper.convertToEntity(userDto);
        User saveUser=repo.save(user);
        return userMapper.convertToDTO(saveUser);
    }

    public User updateUser(int uid, User userDetails) {
        return repo.findById(uid).map(user -> {
            user.setName(userDetails.getName());
            user.setSid(userDetails.getSid());
            user.setBatch(userDetails.getBatch());
            user.setDept(userDetails.getDept());
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            user.setRole(userDetails.getRole());
            user.setNumber(userDetails.getNumber());
            return repo.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found with ID: " + uid));
    }

    public Optional<User> deleteUser(int uid) {
        Optional<User> user=repo.findById(uid);
        repo.deleteById(uid);
        return user;
    }

    public UserDto userLogin(String email, String password){
        User user= repo.findByEmail(email)
                .orElseThrow(()-> new RuntimeException("User not found"));

        if(!user.getPassword().equals(password)){
            throw new RuntimeException("Invalid Password");
        }

        return userMapper.convertToDTO(user);
    }
}
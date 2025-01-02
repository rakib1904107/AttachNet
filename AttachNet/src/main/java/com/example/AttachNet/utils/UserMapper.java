package com.example.AttachNet.utils;

import com.example.AttachNet.model.User;
import com.example.AttachNet.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    // Convert User entity to UserDTO
    public UserDto convertToDTO(User user) {
        UserDto userDTO = new UserDto();
        userDTO.setUid(user.getUid());
        userDTO.setSid(user.getSid());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setBatch(user.getBatch());
        userDTO.setDept(user.getDept());
        userDTO.setRole(user.getRole());
        userDTO.setNumber(user.getNumber());
        return userDTO;
    }

    // Convert UserDTO to User entity
    public User convertToEntity(UserDto userDTO) {
        User user = new User();
        user.setUid(userDTO.getUid());
        user.setSid(userDTO.getSid());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setBatch(userDTO.getBatch());
        user.setDept(userDTO.getDept());
        user.setRole(userDTO.getRole());
        user.setNumber(userDTO.getNumber());
        return user;
    }
    public List<UserDto> convertToDTOList(List<User> users) {
        return users.stream()
                .map(this::convertToDTO)  // Convert each User to UserDTO
                .collect(Collectors.toList());  // Collect results into a list
    }
}

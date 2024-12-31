
package com.example.AttachNet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

    private int uid;
    private String sid;

    @NotBlank(message = "User Name can't be Blank")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")
    private String email;


    private int batch;
    private String dept;
    private String role;
    private String number;

    public int getUid() {
        return uid;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBatch() {
        return batch;
    }

    public String getDept() {
        return dept;
    }

    public String getRole() {
        return role;
    }

    public String getNumber() {
        return number;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

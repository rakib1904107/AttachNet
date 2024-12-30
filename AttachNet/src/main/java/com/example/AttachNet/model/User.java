package com.example.AttachNet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "UserInfo")
public class User {

    @Id
    private int uid;
    private String name;
    private String email;
    private int batch;
    private int phone;

    public User() {
    }

    public User(int uid, String name, String email, int batch, int phone) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.phone = phone;
    }

    public int getUid() {
        return uid;
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

    public int getPhone() {
        return phone;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

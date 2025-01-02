package com.example.AttachNet.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "UserInfo")
public class User {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int uid;

    @Column
    private String sid;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private int batch;

    @Column
    private String dept;

    @Column
    private String role;

    @Column
    private String number;

    public User() {
    }

    public User(int uid, String sid, String name, String email, String password, int batch, String dept, String role, String number) {
        this.uid = uid;
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.batch = batch;
        this.dept = dept;
        this.role = role;
        this.number = number;
    }

    //Getter


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

    public String getPassword() {
        return password;
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

    //Setter

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

    public void setPassword(String password) {
        this.password = password;
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

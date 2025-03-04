package com.gl.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {
    @Id
    int userId;
    String userName;
    String email;
    String address;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public UserProfile(int userId, String userName, String email, String address) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }
    public UserProfile() {
        super();
        // TODO Auto-generated constructor stub
    }



}


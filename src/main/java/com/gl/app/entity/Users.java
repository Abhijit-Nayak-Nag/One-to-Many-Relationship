package com.gl.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_table")
public class Users {

        @Id
        int userId;
        String password;

        @OneToOne(cascade = CascadeType.ALL)
        UserProfile userProfile;

        public Users() {
            super();
            // TODO Auto-generated constructor stub
        }

        public Users(int userId, String password, UserProfile userProfile) {
            super();
            this.userId = userId;
            this.password = password;
            this.userProfile = userProfile;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public UserProfile getUserProfile() {
            return userProfile;
        }

        public void setUserProfile(UserProfile userProfile) {
            this.userProfile = userProfile;
        }


    }

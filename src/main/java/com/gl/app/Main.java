package com.gl.app;

import com.gl.app.entity.UserProfile;
import com.gl.app.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.module.Configuration;

public class Main {
    public static void main( String[] args )
    {
       org.hibernate.cfg.Configuration con = new org.hibernate.cfg.Configuration();
       con.configure("hibernate.cfg.xml");


        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        UserProfile up = new UserProfile();
        up.setUserId(1);
        up.setUserName("Rahul");
        up.setEmail("rahul@ymail.com");
        up.setAddress("Delhi");
        //session.persist(up);

        Users user = new Users();
        user.setUserId(1);
        user.setPassword("1234");
        user.setUserProfile(up);
        session.persist(user);

        tx.commit();
        session.close();
        System.out.println("done");

    }
}

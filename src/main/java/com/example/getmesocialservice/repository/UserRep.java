package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRep {


    public User getuser(){
        User user = new User("Kiran", "Canada", 20,"URL");
        return user;
    }
}

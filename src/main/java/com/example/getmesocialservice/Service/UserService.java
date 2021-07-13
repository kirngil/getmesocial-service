package com.example.getmesocialservice.Service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRep userRep;

    public User getuser(){
        return  userRep.getuser();
    }



}

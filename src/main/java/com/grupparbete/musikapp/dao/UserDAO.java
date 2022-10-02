package com.grupparbete.musikapp.dao;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;

import java.util.Optional;

public class UserDAO {

    UserRepository userRepository;


    public User findCurrentUserById(Long id){
        return userRepository.findUserById(id);

    }


}

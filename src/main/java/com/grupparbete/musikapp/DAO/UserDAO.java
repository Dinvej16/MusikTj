package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;

public class UserDAO {

    UserRepository userRepository;


    public User findCurrentUserById(Long id){
        return userRepository.findUserById(id);

    }


}

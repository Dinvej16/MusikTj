package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;

import java.util.Optional;

public class UserDAO {

    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);

    }

    public Optional <User> findByUsername (String username) {
        return userRepository.findUserByUsername(username);

    }

    public User findCurrentUserById(Long id){
        return userRepository.findUserById(id);


    }


}

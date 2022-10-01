package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;

public class UserDAO {

    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);

    }


}

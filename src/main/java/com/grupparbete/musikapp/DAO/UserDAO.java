package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    public User findUserById(Long id){
        return userRepository.findUserById(id);

    }


}

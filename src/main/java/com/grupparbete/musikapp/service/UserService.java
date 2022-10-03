package com.grupparbete.musikapp.service;

import com.grupparbete.musikapp.DAO.UserDAO;
import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Service
public class UserService {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User getUserById(Long id) {
        return userDAO.findUserById (id);
    }

    public User saveTheUser (User user) {
        return userDAO.saveUser (user);
    }
    // fortsätt här och sedan dao postgres


    }



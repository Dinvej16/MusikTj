<<<<<<< HEAD
package com.grupparbete.musikapp.dao;

public class UserDAO {
=======
package com.grupparbete.musikapp.DAO;

import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    UserRepository userRepository;

    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save (user);
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id);

    }


>>>>>>> Test-branch
}

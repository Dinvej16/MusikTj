package com.grupparbete.musikapp.repository;

import com.grupparbete.musikapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);


}

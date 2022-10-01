package com.grupparbete.musikapp.repository;

import com.grupparbete.musikapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);

    Boolean existsByUsername(String username);

    Optional<User> findUserByUsername(String username);
}

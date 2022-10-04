package com.grupparbete.musikapp.controller;


import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping ("/api")
public class UserController {


    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Get users by ID
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);

    }

    //Save user

    @PostMapping(value="/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveTheUser(user);
    }




}



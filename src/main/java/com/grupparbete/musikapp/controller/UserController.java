package com.grupparbete.musikapp.controller;


import com.grupparbete.musikapp.model.User;
import com.grupparbete.musikapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping ("/api")
public class UserController {


    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}



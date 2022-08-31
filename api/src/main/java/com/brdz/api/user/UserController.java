package com.brdz.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //    CRUD methods

    @Autowired
    UserRepository userRepository;



}

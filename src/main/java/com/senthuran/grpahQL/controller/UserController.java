package com.senthuran.grpahQL.controller;

import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.service.UserService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @SchemaMapping(typeName = "Query",value = "getAllUsers")
    public List<User> findAll() {
        return userService.getAllUsers();
    }
}

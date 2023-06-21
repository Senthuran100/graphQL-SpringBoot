package com.senthuran.grpahQL.controller;

import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.service.UserMutationService;
import com.senthuran.grpahQL.service.UserQueryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private final UserQueryService userService;
    private final UserMutationService userMutationService;

    public UserController(UserQueryService userService, UserMutationService userMutationService) {
        this.userService = userService;
        this.userMutationService = userMutationService;
    }

    @SchemaMapping(typeName = "Query",value = "getAllUsers")
    public List<User> findAll() {
        return userService.getAllUsers();
    }

    @MutationMapping
    public User addUser(@Argument String firstName,@Argument String lastName,@Argument String address) {
        return userMutationService.addUser(firstName, lastName, address);
    }
}

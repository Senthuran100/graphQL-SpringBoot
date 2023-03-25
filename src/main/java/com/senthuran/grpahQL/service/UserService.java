package com.senthuran.grpahQL.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}

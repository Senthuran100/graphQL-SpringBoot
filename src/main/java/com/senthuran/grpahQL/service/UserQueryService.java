package com.senthuran.grpahQL.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserQueryService implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        log.info("Getting All User Info");
        return userRepository.findAll();
    }

//    public UserPost getUserPost(int id) {
//        log.info("Getting user post details for id : {}",id);
//
//    }

}

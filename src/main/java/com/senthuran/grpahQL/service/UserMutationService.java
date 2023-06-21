package com.senthuran.grpahQL.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserMutationService implements GraphQLMutationResolver {
    private final UserRepository userRepository;

    public UserMutationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(String firstname, String lastname, String address) {
        log.info("Adding a User record");
        User user = new User(firstname,lastname,address);
        return userRepository.save(user);
    }
}

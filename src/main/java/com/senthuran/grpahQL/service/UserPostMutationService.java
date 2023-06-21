package com.senthuran.grpahQL.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.senthuran.grpahQL.exception.UserNotFoundException;
import com.senthuran.grpahQL.model.Post;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.PostRepository;
import com.senthuran.grpahQL.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class UserPostMutationService implements GraphQLMutationResolver {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public UserPostMutationService(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    public User addUser(String firstname, String lastname, String address) {
        log.info("Adding a User record");
        User user = new User(firstname,lastname,address);
        return userRepository.save(user);
    }

    public Post addPost(String postName, int userId) {
        log.info("Adding a Post record by userId : {}",userId);
        User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException(userId));
        Post post = new Post(postName, new Date());
        user.getPost().add(post);
        userRepository.save(user);
        return post;
    }
}

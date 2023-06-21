package com.senthuran.grpahQL.service;

import com.senthuran.grpahQL.model.Post;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.PostRepository;
import com.senthuran.grpahQL.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class DataLoader {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void loadData(){
        User user1 = new User("David" ,"John","XX YY ZZ");
        User user2 = new User("Mike" ,"Hussey","PP QQ RR");
        User user3 = new User("Paul" ,"Henry","AA BB CC");

        Post post1 = new Post("SpringBoot",new Date());
        Post post2 = new Post("Environment Pollution",new Date());
        Post post3 = new Post("World",new Date());
        Post post4 = new Post("React Native", new Date());

        user1.setPost(List.of(post1,post4));
        user2.setPost(Collections.singletonList(post2));
        user3.setPost(Collections.singletonList(post3));

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        postRepository.save(post1);
        postRepository.save(post2);
        postRepository.save(post3);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}

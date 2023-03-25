package com.senthuran.grpahQL.service;

import com.senthuran.grpahQL.model.Post;
import com.senthuran.grpahQL.model.User;
import com.senthuran.grpahQL.repository.PostRepository;
import com.senthuran.grpahQL.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataLoader {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void loadData(){
        User user1 = new User("David" ,"John","XX YY ZZ",1);
        User user2 = new User("Mike" ,"Hussey","PP QQ RR",2);
        User user3 = new User("Paul" ,"Henry","AA BB CC",3);

        Post post1 = new Post("SpringBoot",new Date());
        Post post2 = new Post("Environment Pollution",new Date());
        Post post3 = new Post("World",new Date());

        postRepository.save(post1);
        postRepository.save(post2);
        postRepository.save(post3);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}

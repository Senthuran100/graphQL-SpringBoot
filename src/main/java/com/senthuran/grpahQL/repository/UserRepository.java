package com.senthuran.grpahQL.repository;


import com.senthuran.grpahQL.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//    @Query("")
//    UserPost getUserPostByUserId();
}
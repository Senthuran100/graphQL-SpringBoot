package com.senthuran.grpahQL.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "POST_ID")
    private Integer postId;

    public User(String firstName, String lastName, String address, Integer postId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postId = postId;
    }
}




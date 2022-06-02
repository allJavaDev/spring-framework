package com.alljavadev.repository;

import com.alljavadev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User> {
    // ------------------- DERIVED QUERIES ------------------- //

//    //Write a derived query to read a user with an email?
//    Optional<User> findByEmail(String email);
//
//    //Write a derived query to read a user with an username?
//    Optional<User> findByUsername(String username);
//
//    //Write a derived query to list all users that contain a specific name?
//    List <User> findAllByAccountNameContaining(String accountName);
//
//    //Write a derived query to list all users that contain a specific name in the ignore case mode?
//    List<User> findAllByAccountNameContainingIgnoreCase(String accountName);
//
//    //Write a derived query to list all users with an age greater than a specified age?
//    List<User> findAllByAccountAgeGreaterThan(Integer age);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?

    //Write a JPQL query that returns a user read by username?

    //Write a JPQL query that returns all users?

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?

    //Write a native query that returns all users?

    //Write a native query that returns all users in the range of ages?

    //Write a native query to read a user by email?
}

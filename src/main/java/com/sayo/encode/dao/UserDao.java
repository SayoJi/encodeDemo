package com.sayo.encode.dao;

import com.sayo.encode.entity.User;
import com.sayo.encode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * access database to find ar save {@link User}.
 */
@Repository
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    /**
     * get user by give id, id can't be null
     * @param userId user id
     * @return refer to {@link User}
     */
    public User getUserById(Long userId){
        return this.userRepository.getOne(userId);
    }

    /**
     * get all user from data base.
     * @return all user.
     */
    public List<User> getAllUser(){
        return userRepository.findAll();
    }



}

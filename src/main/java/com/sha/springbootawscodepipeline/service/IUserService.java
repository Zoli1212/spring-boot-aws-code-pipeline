package com.sha.springbootawscodepipeline.service;

import com.sha.springbootawscodepipeline.model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}

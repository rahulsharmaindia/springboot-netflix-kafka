package com.referminds.userservice.service;

import com.referminds.userservice.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();
}

package com.example.demo.userservice.service;

import com.example.demo.userservice.model.UserEntity;

import java.util.List;

public interface UserService {
    public UserEntity createUser(UserEntity userEntity);
    public List<UserEntity> displayCustomer();
}

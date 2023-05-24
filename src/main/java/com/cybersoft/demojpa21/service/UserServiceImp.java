package com.cybersoft.demojpa21.service;

import com.cybersoft.demojpa21.entity.UserEntity;

import java.util.List;

public interface UserServiceImp {
    List<UserEntity> getAllUsers();
    List<UserEntity> getUserByEmailAndPassword(String email, String password);

    List<UserEntity> getUserEmailPassword(String email, String password);

    void addUser(UserEntity userEntity);
}

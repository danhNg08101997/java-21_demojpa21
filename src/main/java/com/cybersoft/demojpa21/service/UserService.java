package com.cybersoft.demojpa21.service;

import com.cybersoft.demojpa21.entity.UserEntity;
import com.cybersoft.demojpa21.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImp {
    @Autowired
     UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers(){
        List<UserEntity> list = userRepository.findAll();
        return list;
    }

    @Override
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public List<UserEntity> getUserEmailPassword(String email, String password){
        return userRepository.findUserEmailPassword(email, password);
    }

    @Override
    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }


}

package com.cybersoft.demojpa21.controller;

import com.cybersoft.demojpa21.entity.UserEntity;
import com.cybersoft.demojpa21.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImp userServiceImp;
    @GetMapping("")
    public ResponseEntity<?>getAllUsers(){
        List<UserEntity> list = userServiceImp.getAllUsers();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> getUserByEmailAndPassword(
            @RequestParam String email,
            @RequestParam String password
    ){
        List<UserEntity> list = userServiceImp.getUserByEmailAndPassword(email, password);
        for(UserEntity user:list){
            System.out.println(user.getFullName());
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping ("/getUserEmailPassword")
    public ResponseEntity<?> getUserEmailPassword(@RequestParam String email, @RequestParam String password){
        List<UserEntity> list = userServiceImp.getUserEmailPassword(email, password);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserEntity userEntity){
        userServiceImp.addUser(userEntity);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

}

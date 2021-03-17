package com.sha.springbootawscodepipeline.controller;


import com.sha.springbootawscodepipeline.model.User;
import com.sha.springbootawscodepipeline.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user){


        if(userService.findByUsername(user.getUsername())!=null){

            return new ResponseEntity<>((HttpStatus.CONFLICT));
        }

        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);



    }
    @GetMapping
    public ResponseEntity<?> getAllUsers(){


        return ResponseEntity.ok(userService.findAllUsers());

    }
}

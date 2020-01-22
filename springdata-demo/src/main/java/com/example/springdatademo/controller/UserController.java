package com.example.springdatademo.controller;

import com.example.springdatademo.model.User;
import com.example.springdatademo.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserJPARepository userJPARepository;

    @GetMapping(value="/all")
    public List<User> findAll(){
        return userJPARepository.findAll();
    }

    @GetMapping(value="/{name}")
    public User findByName(@PathVariable final String name){
        return userJPARepository.findByName(name);
    }

    @PostMapping(value="/load")
    public Long save(@RequestBody final User user){
        User userSaved = userJPARepository.save(user);
        return userSaved.getId();
    }
}

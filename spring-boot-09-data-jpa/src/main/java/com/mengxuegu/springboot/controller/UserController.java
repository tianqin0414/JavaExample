package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import com.mengxuegu.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Auther: 梦学谷
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.get();
        return user;
    }

    @GetMapping("/user")
    public User addUser(User user) {
        User user2 = userRepository.save(user);
        return user2;
    }


    @Autowired
    IUserService userService;

    @GetMapping("/user2")
    public User addUser2(User user) {
        userService.addUser(user);
        return user;
    }


}

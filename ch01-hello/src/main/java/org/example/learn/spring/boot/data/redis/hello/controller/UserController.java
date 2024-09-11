package org.example.learn.spring.boot.data.redis.hello.controller;

import org.example.learn.spring.boot.data.redis.commons.model.user.po.UserPO;
import org.example.learn.spring.boot.data.redis.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public String saveUser(@RequestBody UserPO UserPO) {
        userRepository.save(UserPO);
        return "UserPO saved!";
    }

    @GetMapping("/{id}")
    public UserPO getUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.delete(id);
        return "UserPO deleted!";
    }
}

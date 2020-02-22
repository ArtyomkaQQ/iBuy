package com.dev.ibuy.controller;

import com.dev.ibuy.entity.User;
import com.dev.ibuy.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/list_users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{id}")
    public User getProduct(@PathVariable(name = "id") Long id) {
        return userRepository.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        userRepository.deleteById(id);
    }

}

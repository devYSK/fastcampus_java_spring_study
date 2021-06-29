package com.example.exception.controller;


import com.example.exception.dto.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RestApiController {


    @RequestMapping("")
    public User get(@RequestParam String name, @RequestParam(required = false) Integer age) {

        User user = new User();
        user.setAge(age);
        user.setName(name);

        int a = 10 + age;

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        System.out.println(user);

        return user;
    }

}

package com.example.exception.controller;


import com.example.exception.dto.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api")
@Validated
public class ApiController {


    @RequestMapping("")
    public User get(
            @Size(min = 1)
            @RequestParam String name,

            @NotNull @Min(1)
            @RequestParam Integer age) {

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

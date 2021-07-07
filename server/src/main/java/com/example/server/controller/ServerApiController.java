package com.example.server.controller;

import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/hello")
    public User hello(@RequestParam String name, @RequestParam int age) {

        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user/{userId}/name/{userName}")
    public User post(@RequestBody User user,
                     @PathVariable("userId")int id,
                     @PathVariable("userName") String name,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader) {
        log.info("userId : {}, userName : {}", id, name);
        log.info("client req : {}", user);
        log.info("authorization : {}", authorization);
        log.info("custom-header : {}", customHeader);

        return user;
    }


}

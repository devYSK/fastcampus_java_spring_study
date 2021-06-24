package com.example.aop.controller;

import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {


    @GetMapping("/get/{id}")
    public void get(@PathVariable Long id, @RequestParam String name) {

        System.out.println("get method");
        System.out.println("get method" + id);
        System.out.println("get method" + name);

    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        System.out.println("post method : " + user);
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // need db logic


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Thread.sleep(1000 * 2);

        stopWatch.stop();
        System.out.println("total time : " + stopWatch.getTotalTimeSeconds());

    }

    @PostMapping("/put")
    public User put(@RequestBody User user) {
        System.out.println("put");
        System.out.println(user);

        return user;
    }
}

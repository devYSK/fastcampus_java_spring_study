package com.fastcampus.jpa.bookmanager.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test() {
        User user = new User();
        user.setEmail("adfa@naver.com");
        user.setName("asdf");

        System.out.println(">>> " + user);
    }
}
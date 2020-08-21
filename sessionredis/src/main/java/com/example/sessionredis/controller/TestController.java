package com.example.sessionredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-13 22:01
 **/
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/set")
    public String set(HttpSession session) {
        session.setAttribute("user", "javaboy");
        return "1";
    }
    @GetMapping("/get")
    public String get(HttpSession session) {
        return session.getAttribute("user")+"";
    }
}

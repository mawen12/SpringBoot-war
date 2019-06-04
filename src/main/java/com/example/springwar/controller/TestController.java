package com.example.springwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-war
 * @description: 测试
 * @author: Mw
 * @create: 2019-06-03 20:07
 **/

@RestController
public class TestController {

    @RequestMapping(value = "test", produces = "application/json;charset=UTF-8")
    public String test(){
        return "{\"code\": 200,\"message\": \"成功\"}";
    }
}

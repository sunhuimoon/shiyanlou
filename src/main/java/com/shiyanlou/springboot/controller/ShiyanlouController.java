package com.shiyanlou.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController相当于同时使用@Controller和@ResponseBody注解
//@RestController
//注意这里已经不是@RestController了 和上个试验不同，
// 因为需要返回视图，所以不能使用@ResponseBody
@Controller
//@PropertySource(value = "classpath:shiyanlou.properties")
public class ShiyanlouController {
//使用@Value注解注入属性值
//    @Value("${shiyanlou.test}")
//    private String shiyanlou;
//    @RequestMapping("/")
//    public String shiyanlou() {
//        return shiyanlou + "hahha";
//    }
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
    //http://localhost:8080/shi
    @RequestMapping("shi")
    public String shi(){
        return "shiyanlou";
    }

}

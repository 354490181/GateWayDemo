package com.student.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author llj
 * @date 2019/8/28
 * */
@RestController
@RequestMapping("/student")
public class HelloWorldController {
    @GetMapping("/hello")
    public String test01(){
        return "HelloWorld!";
    }
}

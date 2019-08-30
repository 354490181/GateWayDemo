package com.llj.webflux.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author llj
 * @date 2019/8/29
 * */
@RestController
public class HelloYun {
    @GetMapping("/hello")
    public String first(){
        return "HelloYun";
    }
}

package cn.edw.mavendemo.controller;

import cn.edw.mavendemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 2/5/2021 4:05 PM.
 */

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return helloService.sayHello();
    }
}

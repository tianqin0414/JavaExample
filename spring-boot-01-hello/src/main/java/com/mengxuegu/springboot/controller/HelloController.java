package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: HelloController
 * @Description: com.mengxuegu.springboot.controller
 * @Auther: www.mengxuegu.com
 * @Version: 1.0
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello World...oh yeah";
    }

}

package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: InitController
 * @Description: com.mengxuegu.controller
 * @Auther: www.mengxuegu.com
 * @Version: 1.0
 */
@Controller
public class InitController {

    @ResponseBody
    @RequestMapping("/info")
    public String init() {
        return "hello init...";
    }

}

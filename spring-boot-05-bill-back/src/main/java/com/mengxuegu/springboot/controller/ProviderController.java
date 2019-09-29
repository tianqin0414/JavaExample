package com.mengxuegu.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 供应商的控制层
 * @Auther: 梦学谷
 */
@Controller
public class ProviderController {

    //@RequestMapping( value="/providers", method = RequestMethod.GET)
    @GetMapping("/providers")
    public String list() {
        //classpath:/templates/
        //classpath:/templates/provider/list.html
        return "provider/list";
    }
}
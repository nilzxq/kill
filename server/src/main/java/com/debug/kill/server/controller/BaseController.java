package com.debug.kill.server.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

public class BaseController {

    private static final Logger log= LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value="/welcome")
    public String welcome(){
        return "welcome";
    }
}

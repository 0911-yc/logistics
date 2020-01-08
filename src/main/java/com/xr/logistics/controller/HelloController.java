package com.xr.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/select")
    public String main(){
        System.out.println("abc");
        return "/pages/main";
    }
}

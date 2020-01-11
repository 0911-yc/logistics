package com.xr.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TheLibraryController {

    @RequestMapping("/TheLibrary")
    public String select(){
        return "/pages/sortingManagement/theLibrary";
    }
}

package com.xr.logistics.controller;

import com.xr.logistics.model.SorStorage;
import com.xr.logistics.service.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StorageController {

    @Autowired
    private SorStorageService sorStorageService;

    @RequestMapping("/Storage")
    public ModelAndView select(){
        List<SorStorage> sorStorages =sorStorageService.select();
        ModelAndView mv = new ModelAndView();
        mv.addObject("sorStorages",sorStorages);
        mv.setViewName("/pages/sortingManagement/storage");
        return mv;
    }

}

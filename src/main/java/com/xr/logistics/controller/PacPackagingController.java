package com.xr.logistics.controller;

import com.xr.logistics.model.PacPackaging;
import com.xr.logistics.service.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PacPackagingController {
    @Autowired
    private PacPackagingService pacPackagingService;

    /**
     * 跳转到包装材料物品管理页面
     * @return
     */
    @RequestMapping("/PacPackaging")
    public ModelAndView PacPackaging(){
        //调用pacPackagingService中findPacPackagings方法
        List<PacPackaging> pacPackagings = pacPackagingService.findPacPackagings();
        ModelAndView mv = new ModelAndView();
        mv.addObject("pacPackagings",pacPackagings);
        mv.setViewName("/pages/packagingMaterialManagement/packagingMaterialManagement");
        return mv;
    }

    /**
     * 包装材料物品管理增加的页面
     * @return
     */
    @RequestMapping("/packagingMaterialManagementadd")
    public String packagingMaterialManagementadd(){
        return "/pages/packagingMaterialManagement/packagingMaterialManagement_add";
    }

    /**
     * 入库管理
     * @return
     */
    @RequestMapping("/warehousingManagement")
    public String warehousingManagement(){
        return "/pages/packagingMaterialManagement/warehousingManagement";
    }

    /**
     * 出库管理
     * @return
     */
    @RequestMapping("/outboundManagement")
    public String outboundManagement(){
        return "/pages/packagingMaterialManagement/outboundManagement";
    }

    /**
     * 库存管理
     * @return
     */
    @RequestMapping("/inventoryManagement")
    public String inventoryManagement(){
        return "/pages/packagingMaterialManagement/inventoryManagement";
    }
}

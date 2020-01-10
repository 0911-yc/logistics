package com.xr.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

<<<<<<< Updated upstream
//    首页
    @RequestMapping("/main")
    public String main(){
        return "/pages/main";
    }
    //基础数据
    @RequestMapping("/workbrnch")
    public String workbrnch(){
        return "/pages/workbench";
    }
    //登录
    @RequestMapping("/login")
    public String login(){
        return "/pages/login";
    }

    //收派标准
    @RequestMapping("/deliveryStandard")
    public String deliveryStandard(){
        return "/pages/basicData/deliveryStandard";
    }

    //基础档案
    @RequestMapping("/basicArchives")
    public String basicArchives(){
        return "/pages/basicData/basicArchives";
    }

    //班车设置
    @RequestMapping("/shuttleBusSet")
    public String shuttleBusSet(){
        return "/pages/basicData/shuttleBusSet";
    }

    //取派员设置
    @RequestMapping("/dispatchingPersonnelSet")
    public String dispatchingPersonnelSet(){
        return "/pages/basicData/dispatchingPersonnelSet";
    }

    //区域设置
    @RequestMapping("/areaSet")
    public String areaSet(){
        return "/pages/basicData/areaSet";
    }

    //管理分区
    @RequestMapping("/partition")
    public String partition(){
        return "/pages/basicData/partition";
    }

    //管理定区
    @RequestMapping("/zone")
    public String zone(){
        return "/pages/basicData/zone";
    }

    //收派时间管理
    @RequestMapping("/deliveryTime")
    public String deliveryTime(){
        return "/pages/basicData/deliveryTime";
    }

    //单位管理
    @RequestMapping("/sysUnit")
    public String sysUnit(){
        return "/pages/systemManagement/sysUnit";
    }

    //员工管理
    @RequestMapping("/sysEmp")
    public String sysEmp(){
        return "/pages/systemManagement/sysEmp";
    }

    //栏目管理
    @RequestMapping("/sysMenu")
    public String sysMenu(){
        return "/pages/systemManagement/sysMenu";
    }

    //角色管理
    @RequestMapping("/sysRole")
    public String sysRole(){
        return "/pages/systemManagement/sysRole";
    }
=======
    /**
     * 系统管理
     * @return
     */
    @RequestMapping("/main")
    public String getmain(){
        return "/pages/main";
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping("/getworkbench")
    public String getworkbench(){
        System.out.println("进来了");
        return "/pages/workbench";
    }

>>>>>>> Stashed changes
}

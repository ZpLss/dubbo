package com.ontheway.controller;

import com.ontheway.dubbo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : zp
 *         Date: 2019/2/13 15:57
 *         Description:
 */
@Controller
public class TestController {

    @Autowired
    private Service service;

    @RequestMapping(value = "/getName.do")
    public String getName (){
        String name = service.getName();
        System.out.println(name);
        return name;
    }


}

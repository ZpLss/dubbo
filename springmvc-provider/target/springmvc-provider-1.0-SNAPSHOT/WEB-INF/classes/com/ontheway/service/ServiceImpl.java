package com.ontheway.service;

import com.ontheway.dubbo.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : zp
 *         Date: 2019/2/13 17:08
 *         Description:
 */
@org.springframework.stereotype.Service("serviceImpl")//创建serviceImpl对象
public class ServiceImpl implements Service{
    @RequestMapping(value = "/getName.do")
    public String getName() {
        return "我是服务的提供者provider";
    }
}

package com.project.impl;


import com.project.api.Api;
import org.apache.dubbo.config.annotation.DubboService;



/**
 * @author wuxiong
 * @Classname ApiImpl
 * @Description TODO
 * @Date 2021/1/19 15:04
 */
@DubboService
public class ApiImpl implements Api{

    @Override
    public void get() {
        System.out.println("qqqqqqqqqqqqqqqq");
    }
}

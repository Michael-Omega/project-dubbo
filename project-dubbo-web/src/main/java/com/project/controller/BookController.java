package com.project.controller;

import com.project.api.BookApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiong
 * @Classname ApiController
 * @Description TODO
 * @Date 2021/1/19 16:25
 */
@RestController
public class BookController {

    @DubboReference
    private BookApi bookApi;


    @RequestMapping("/get")
    public void get(){
        bookApi.get();
    }

}

package com.project.impl;


import com.project.api.BookApi;
import com.project.domain.Book;
import com.project.mapper.BookMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;


/**
 * @author wuxiong
 * @Classname ApiImpl
 * @Description TODO
 * @Date 2021/1/19 15:04
 */
@DubboService
public class ApiImpl implements BookApi {

    @Resource
    private BookMapper bookMapper;

    @Override
    public void get() {
        Book book = new Book();
        book.setId(7);
        bookMapper.insertSelective(book);

        System.out.println("qqqqqqqqqqqqqqqq");
    }
}

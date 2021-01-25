package com.project.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * @author wuxiong
 * @Classname BaseRepository
 * @Description TODO
 * @Date 2021/1/25 11:03
 */
public interface BaseRepository<T> extends Mapper<T>, MySqlMapper<T> {
}

package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TBook;
import org.apache.ibatis.annotations.Mapper;


/**
 * (TBook)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:48
 */
@Mapper
public interface TBookDao extends BaseMapper<TBook> {

}


package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TOrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * (TOrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:46
 */
@Mapper
public interface TOrderItemDao extends BaseMapper<TOrderItem> {

}


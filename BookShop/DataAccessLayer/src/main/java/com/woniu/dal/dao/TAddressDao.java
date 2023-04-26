package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TAddress;
import org.apache.ibatis.annotations.Mapper;

/**
 * (TAddress)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:48
 */
@Mapper
public interface TAddressDao extends BaseMapper<TAddress> {

}


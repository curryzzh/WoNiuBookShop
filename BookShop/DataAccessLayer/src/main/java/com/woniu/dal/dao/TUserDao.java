package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TUser;
import org.apache.ibatis.annotations.Mapper;


/**
 * (TUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:45
 */
@Mapper
public interface TUserDao extends BaseMapper<TUser> {

}


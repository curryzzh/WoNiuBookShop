package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TManager;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内部员工信息(TManager)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:47
 */
@Mapper
public interface TManagerDao extends BaseMapper<TManager> {

}


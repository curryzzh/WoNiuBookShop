package com.woniu.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.dal.entity.TRoleUrlPermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与菜单、接口权限的对应关系(TRoleUrlPermission)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 12:15:46
 */
@Mapper
public interface TRoleUrlPermissionDao extends BaseMapper<TRoleUrlPermission> {

}


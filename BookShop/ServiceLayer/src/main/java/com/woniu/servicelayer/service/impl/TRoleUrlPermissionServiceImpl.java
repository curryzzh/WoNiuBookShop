package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TRoleUrlPermissionDao;
import com.woniu.dal.entity.TRoleUrlPermission;
import com.woniu.servicelayer.service.TRoleUrlPermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色与菜单、接口权限的对应关系(TRoleUrlPermission)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:12
 */
@Service("tRoleUrlPermissionService")
public class TRoleUrlPermissionServiceImpl extends ServiceImpl<TRoleUrlPermissionDao, TRoleUrlPermission> implements TRoleUrlPermissionService {

}


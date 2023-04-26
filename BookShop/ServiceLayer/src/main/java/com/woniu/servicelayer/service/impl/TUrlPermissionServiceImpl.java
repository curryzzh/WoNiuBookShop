package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TUrlPermissionDao;
import com.woniu.dal.entity.TUrlPermission;
import com.woniu.servicelayer.service.TUrlPermissionService;
import org.springframework.stereotype.Service;

/**
 * 菜单和接口权限定义(TUrlPermission)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:12
 */
@Service("tUrlPermissionService")
public class TUrlPermissionServiceImpl extends ServiceImpl<TUrlPermissionDao, TUrlPermission> implements TUrlPermissionService {

}


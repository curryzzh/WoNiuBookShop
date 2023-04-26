package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TRoleDao;
import com.woniu.dal.entity.TRole;
import com.woniu.servicelayer.service.TRoleService;
import org.springframework.stereotype.Service;

/**
 * (TRole)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:12
 */
@Service("tRoleService")
public class TRoleServiceImpl extends ServiceImpl<TRoleDao, TRole> implements TRoleService {

}


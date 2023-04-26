package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TManagerRoleDao;
import com.woniu.dal.entity.TManagerRole;
import com.woniu.servicelayer.service.TManagerRoleService;
import org.springframework.stereotype.Service;

/**
 * (TManagerRole)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:13
 */
@Service("tManagerRoleService")
public class TManagerRoleServiceImpl extends ServiceImpl<TManagerRoleDao, TManagerRole> implements TManagerRoleService {

}


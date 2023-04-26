package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TUserDao;
import com.woniu.dal.entity.TUser;
import com.woniu.servicelayer.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:12
 */
@Service("tUserService")
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUser> implements TUserService {

}


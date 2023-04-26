package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TAddressDao;
import com.woniu.dal.entity.TAddress;
import com.woniu.servicelayer.service.TAddressService;
import org.springframework.stereotype.Service;

/**
 * (TAddress)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:14
 */
@Service("tAddressService")
public class TAddressServiceImpl extends ServiceImpl<TAddressDao, TAddress> implements TAddressService {

}


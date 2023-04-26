package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TOrderDao;
import com.woniu.dal.entity.TOrder;
import com.woniu.servicelayer.service.TOrderService;
import org.springframework.stereotype.Service;

/**
 * (TOrder)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:13
 */
@Service("tOrderService")
public class TOrderServiceImpl extends ServiceImpl<TOrderDao, TOrder> implements TOrderService {

}


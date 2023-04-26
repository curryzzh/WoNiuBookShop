package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TOrderItemDao;
import com.woniu.dal.entity.TOrderItem;
import com.woniu.servicelayer.service.TOrderItemService;
import org.springframework.stereotype.Service;

/**
 * (TOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:13
 */
@Service("tOrderItemService")
public class TOrderItemServiceImpl extends ServiceImpl<TOrderItemDao, TOrderItem> implements TOrderItemService {

}


package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TConmentDao;
import com.woniu.dal.entity.TConment;
import com.woniu.servicelayer.service.TConmentService;
import org.springframework.stereotype.Service;

/**
 * (TConment)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:13
 */
@Service("tConmentService")
public class TConmentServiceImpl extends ServiceImpl<TConmentDao, TConment> implements TConmentService {

}


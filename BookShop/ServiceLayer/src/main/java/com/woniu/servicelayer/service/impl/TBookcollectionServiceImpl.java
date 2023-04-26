package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TBookcollectionDao;
import com.woniu.dal.entity.TBookcollection;
import com.woniu.servicelayer.service.TBookcollectionService;
import org.springframework.stereotype.Service;

/**
 * (TBookcollection)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:14
 */
@Service("tBookcollectionService")
public class TBookcollectionServiceImpl extends ServiceImpl<TBookcollectionDao, TBookcollection> implements TBookcollectionService {

}


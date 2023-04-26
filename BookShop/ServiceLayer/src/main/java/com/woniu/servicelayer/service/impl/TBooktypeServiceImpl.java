package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TBooktypeDao;
import com.woniu.dal.entity.TBooktype;
import com.woniu.servicelayer.service.TBooktypeService;
import org.springframework.stereotype.Service;

/**
 * (TBooktype)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:14
 */
@Service("tBooktypeService")
public class TBooktypeServiceImpl extends ServiceImpl<TBooktypeDao, TBooktype> implements TBooktypeService {

}


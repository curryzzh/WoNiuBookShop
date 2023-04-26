package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TBookDao;
import com.woniu.dal.entity.TBook;
import com.woniu.servicelayer.service.TBookService;
import org.springframework.stereotype.Service;

/**
 * (TBook)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:14
 */
@Service("tBookService")
public class TBookServiceImpl extends ServiceImpl<TBookDao, TBook> implements TBookService {

}


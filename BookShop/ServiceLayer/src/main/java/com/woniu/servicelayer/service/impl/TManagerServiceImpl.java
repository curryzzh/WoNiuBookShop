package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TManagerDao;
import com.woniu.dal.entity.TManager;
import com.woniu.servicelayer.service.TManagerService;
import org.springframework.stereotype.Service;

/**
 * 内部员工信息(TManager)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:13
 */
@Service("tManagerService")
public class TManagerServiceImpl extends ServiceImpl<TManagerDao, TManager> implements TManagerService {

}


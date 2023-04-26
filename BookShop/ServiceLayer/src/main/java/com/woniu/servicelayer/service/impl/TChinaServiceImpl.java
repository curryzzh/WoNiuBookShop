package com.woniu.servicelayer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.woniu.dal.dao.TChinaDao;
import com.woniu.dal.entity.TChina;
import com.woniu.servicelayer.service.TChinaService;
import org.springframework.stereotype.Service;

/**
 * (TChina)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 12:17:14
 */
@Service("tChinaService")
public class TChinaServiceImpl extends ServiceImpl<TChinaDao, TChina> implements TChinaService {

}


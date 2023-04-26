package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniu.dal.entity.TAddress;
import com.woniu.servicelayer.service.TAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (TAddress)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:08
 */
@RestController
@RequestMapping("tAddress")
public class TAddressController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    TAddressService tAddressService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param tAddress 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TAddress> page, TAddress tAddress) {
        return success(this.tAddressService.page(page, new QueryWrapper<>(tAddress)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tAddressService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tAddress 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TAddress tAddress) {
        return success(this.tAddressService.save(tAddress));
    }

    /**
     * 修改数据
     *
     * @param tAddress 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TAddress tAddress) {
        return success(this.tAddressService.updateById(tAddress));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tAddressService.removeByIds(idList));
    }
}


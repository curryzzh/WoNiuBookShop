package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TBookcollection;
import com.woniu.servicelayer.service.TBookcollectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TBookcollection)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:08
 */
@RestController
@RequestMapping("tBookcollection")
public class TBookcollectionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TBookcollectionService tBookcollectionService;

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param tBookcollection 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TBookcollection> page, TBookcollection tBookcollection) {
        return success(this.tBookcollectionService.page(page, new QueryWrapper<>(tBookcollection)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tBookcollectionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tBookcollection 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TBookcollection tBookcollection) {
        return success(this.tBookcollectionService.save(tBookcollection));
    }

    /**
     * 修改数据
     *
     * @param tBookcollection 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TBookcollection tBookcollection) {
        return success(this.tBookcollectionService.updateById(tBookcollection));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tBookcollectionService.removeByIds(idList));
    }
}


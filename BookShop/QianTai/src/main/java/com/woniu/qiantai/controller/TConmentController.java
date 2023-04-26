package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TConment;
import com.woniu.servicelayer.service.TConmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TConment)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:07
 */
@RestController
@RequestMapping("tConment")
public class TConmentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TConmentService tConmentService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param tConment 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TConment> page, TConment tConment) {
        return success(this.tConmentService.page(page, new QueryWrapper<>(tConment)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tConmentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tConment 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TConment tConment) {
        return success(this.tConmentService.save(tConment));
    }

    /**
     * 修改数据
     *
     * @param tConment 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TConment tConment) {
        return success(this.tConmentService.updateById(tConment));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tConmentService.removeByIds(idList));
    }
}


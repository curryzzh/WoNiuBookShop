package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TBooktype;
import com.woniu.servicelayer.service.TBooktypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TBooktype)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:07
 */
@RestController
@RequestMapping("tBooktype")
public class TBooktypeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TBooktypeService tBooktypeService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param tBooktype 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TBooktype> page, TBooktype tBooktype) {
        return success(this.tBooktypeService.page(page, new QueryWrapper<>(tBooktype)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tBooktypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tBooktype 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TBooktype tBooktype) {
        return success(this.tBooktypeService.save(tBooktype));
    }

    /**
     * 修改数据
     *
     * @param tBooktype 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TBooktype tBooktype) {
        return success(this.tBooktypeService.updateById(tBooktype));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tBooktypeService.removeByIds(idList));
    }
}


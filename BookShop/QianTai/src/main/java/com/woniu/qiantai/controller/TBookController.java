package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TBook;
import com.woniu.servicelayer.service.TBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TBook)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:08
 */
@RestController
@RequestMapping("tBook")
public class TBookController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TBookService tBookService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param tBook 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TBook> page, TBook tBook) {
        return success(this.tBookService.page(page, new QueryWrapper<>(tBook)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tBookService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tBook 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TBook tBook) {
        return success(this.tBookService.save(tBook));
    }

    /**
     * 修改数据
     *
     * @param tBook 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TBook tBook) {
        return success(this.tBookService.updateById(tBook));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tBookService.removeByIds(idList));
    }
}


package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TChina;
import com.woniu.servicelayer.service.TChinaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TChina)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:07
 */
@RestController
@RequestMapping("tChina")
public class TChinaController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TChinaService tChinaService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param tChina 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TChina> page, TChina tChina) {
        return success(this.tChinaService.page(page, new QueryWrapper<>(tChina)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tChinaService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tChina 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TChina tChina) {
        return success(this.tChinaService.save(tChina));
    }

    /**
     * 修改数据
     *
     * @param tChina 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TChina tChina) {
        return success(this.tChinaService.updateById(tChina));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tChinaService.removeByIds(idList));
    }
}


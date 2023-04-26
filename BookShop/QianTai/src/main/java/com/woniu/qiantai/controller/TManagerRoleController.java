package com.woniu.qiantai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.woniu.dal.entity.TManagerRole;
import com.woniu.servicelayer.service.TManagerRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TManagerRole)表控制层
 *
 * @author makejava
 * @since 2023-04-26 12:15:07
 */
@RestController
@RequestMapping("tManagerRole")
public class TManagerRoleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TManagerRoleService tManagerRoleService;

    /**
     * 分页查询所有数据
     *
     * @param page         分页对象
     * @param tManagerRole 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TManagerRole> page, TManagerRole tManagerRole) {
        return success(this.tManagerRoleService.page(page, new QueryWrapper<>(tManagerRole)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tManagerRoleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tManagerRole 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TManagerRole tManagerRole) {
        return success(this.tManagerRoleService.save(tManagerRole));
    }

    /**
     * 修改数据
     *
     * @param tManagerRole 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TManagerRole tManagerRole) {
        return success(this.tManagerRoleService.updateById(tManagerRole));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tManagerRoleService.removeByIds(idList));
    }
}


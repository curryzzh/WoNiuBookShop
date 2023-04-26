package com.woniu.dal.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 角色与菜单、接口权限的对应关系(TRoleUrlPermission)表实体类
 *
 * @author makejava
 * @since 2023-04-26 12:15:46
 */
@SuppressWarnings("serial")
public class TRoleUrlPermission extends Model<TRoleUrlPermission> {
    //自增主键
    private Long id;
    //权限id
    private Long urlPermissionId;
    //角色id
    private Long roleId;
    //创建时间
    private Date insertTime;
    //更新时间
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUrlPermissionId() {
        return urlPermissionId;
    }

    public void setUrlPermissionId(Long urlPermissionId) {
        this.urlPermissionId = urlPermissionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}


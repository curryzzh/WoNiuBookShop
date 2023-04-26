package com.woniu.dal.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (TBookcollection)表实体类
 *
 * @author makejava
 * @since 2023-04-26 12:15:47
 */
@SuppressWarnings("serial")
public class TBookcollection extends Model<TBookcollection> {

    private Integer id;

    private Integer userId;

    private Integer bookId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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


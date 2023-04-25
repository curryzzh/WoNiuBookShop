package com.woniu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.entity.User;
import net.minidev.json.writer.BeansMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> queryAll();

    @Select("select * from user")
    List<User> queryAll2();
}

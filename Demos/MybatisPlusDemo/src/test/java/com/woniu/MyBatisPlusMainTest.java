package com.woniu;

import com.woniu.entity.User;
import com.woniu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusMainTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test1(){


        System.out.println( userMapper.queryAll());
        System.out.println("****************************************");
        User user = new User();

        user.setAge(18);
        user.setName("woniu");
        user.setEmail("woniu@woniuxy.com");

        userMapper.insert(user);

        System.out.println( userMapper.queryAll2() );

    }
}

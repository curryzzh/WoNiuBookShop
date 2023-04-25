package com.woniu.controller;

import com.woniu.entity.User;
import com.woniu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createUser(User user){
        userService.save(user);
        return ResponseEntity.ok().build();
    }
    @RequestMapping("getUserById")
    @ResponseBody
    public ResponseEntity<User> getUserById(Integer id) {
        User user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @RequestMapping("/update")
    @ResponseBody
    public ResponseEntity<?> updateUser(Integer id, User user) {
        user.setId(id);
        userService.updateById(user);
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResponseEntity<?> deleteUser(Integer id) {
        userService.removeById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/list")
    @ResponseBody
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> users = userService.list();
        return ResponseEntity.ok(users);
    }
}

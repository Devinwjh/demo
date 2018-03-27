package com.wjh.demo.test.controller;

import com.wjh.demo.core.service.inf.UserService;
import com.wjh.demo.db.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Devin wei
 * @Description ""
 * @Date 2018/3/26
 */
@RestController
public class TestController {

    @Resource
    UserService userService;

    @GetMapping("user")
    public User getUser(int id){
        return userService.selectUserById(id);
    }
}

package com.wjh.demo.api.web.controller;

import com.wjh.demo.core.service.inf.UserService;
import com.wjh.demo.db.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author Devin wei
 * @Description ""
 * @Date 2018/3/26
 */
@RestController
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("getUser")
    public User getUser(int id){
        return userService.selectUserById(id);
    }
}

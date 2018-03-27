package com.wjh.demo.core.service.impl;

import com.wjh.demo.core.service.inf.UserService;
import com.wjh.demo.db.dao.UserDao;
import com.wjh.demo.db.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Devin wei
 * @Description ""
 * @Date 2018/3/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return userDao.updateUserById(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}

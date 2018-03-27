package com.wjh.demo.core.service.inf;

import com.wjh.demo.db.pojo.User;

/**
 * @Author Devin wei
 * @Description ""
 * @Date 2018/3/26
 */

public interface UserService {

    User selectUserById(int id);

    int insertUser(User user);

    int updateUserById(User user);

    int deleteUserById(int id);
}

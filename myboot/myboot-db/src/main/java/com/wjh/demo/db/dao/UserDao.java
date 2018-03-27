package com.wjh.demo.db.dao;

import com.wjh.demo.db.pojo.User;
import org.apache.ibatis.annotations.*;

/**
 * @Author Devin wei
 * @Description ""
 * @Date 2018/3/26
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id} limit 1")
    User selectUserById(int id);

    @Insert("insert into user (id,name,password) value (#{id},#{name},#{password})")
    int insertUser(User user);

    @Update("update user set id = ${id} and name = #{name} and password = #{password} where id = ${id}")
    int updateUserById(User user);

    @Delete("delete from user where id = ${id}")
    int deleteUserById(int id);
}

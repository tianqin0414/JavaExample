package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.User;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
public interface UserMapper {

    List<User> getUsers(User user);

    User getUserByUsername(String username);

    User getUserById(Integer id);


    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(Integer id);

}

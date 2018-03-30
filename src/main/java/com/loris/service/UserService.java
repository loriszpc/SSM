package com.loris.service;

import com.loris.entity.User;
import java.util.List;

/**
 * @author loris
 * @date 2018/3/29 17:10
 */
public interface UserService {

    List<User> selectUserList();

    int addUser(List<User> userList);
}

package com.loris.service.impl;

import com.loris.dao.UserMapper;
import com.loris.entity.User;
import com.loris.entity.UserExample;
import com.loris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author loris
 * @date 2018/3/29 17:11
 */
@Service
public class UserSeviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserList() {
        List<User> userList = userMapper.selectByExample(new UserExample());
        return userList;
    }

    public int addUser(List<User> userList) {
        int count=0;
        for (int i = 0; i < userList.size(); i++) {
            User user=userList.get(i);
            int num=userMapper.insert(user);
            count+=num;
        }

        return count;
    }
}

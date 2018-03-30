package com.loris.util.task;

import com.loris.entity.User;
import com.loris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author loris
 * @date 2018/3/30 16:58
 */
@Component
public class BaseTask {

    @Autowired
    private UserService userService;


    @Scheduled(cron = "0/10 * * * * ?")
    public void execute() {
        List<User> userList=userService.selectUserList();
        System.out.println("执行定时任务获取到的信息："+userList.toString());

    }

}

package org.boot.showcase.user.service.impl;

import org.boot.showcase.user.entity.UserInfo;
import org.boot.showcase.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午3:40
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UserServiceImpl implements UserService {
    public List<UserInfo> listUser() {
        List<UserInfo> us = new ArrayList<UserInfo>();
        UserInfo ui;
        for (int i = 0; i < 10; i++) {
            ui = new UserInfo();
            ui.setId(Long.valueOf(i));
            ui.setName("user-"+i);
            us.add(ui);
        }
        return us;
    }
}

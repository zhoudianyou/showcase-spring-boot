package org.boot.showcase.user.service;

import org.boot.showcase.user.entity.UserInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午3:39
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {

    public List<UserInfo> listUser();
}

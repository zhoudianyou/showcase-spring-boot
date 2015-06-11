package org.boot.showcase.user.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午3:09
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 2111836198129025636L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

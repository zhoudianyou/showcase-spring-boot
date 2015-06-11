package org.boot.showcase.user.controller;

import org.boot.showcase.user.entity.UserInfo;
import org.boot.showcase.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午3:11
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    @RequestMapping(value = "/index")
    public ModelAndView list() {
        ModelAndView view = new ModelAndView();
        view.setViewName("/user/index");
        return view;
    }
}

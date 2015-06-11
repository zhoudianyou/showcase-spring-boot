package org.boot.showcase.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午4:04
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class Homecontroller {

    @RequestMapping(value = "/")
    public String home(Map<String, Object> modl) {
        return "hello";
    }


}

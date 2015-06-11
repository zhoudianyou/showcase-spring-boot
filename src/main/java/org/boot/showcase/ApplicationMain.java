package org.boot.showcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudianyou
 * Date: 15/6/10
 * Time: 下午2:43
 * Email: zhoudianyou@126.com
 * To change this template use File | Settings | File Templates.
 */
@Configuration()
@EnableAutoConfiguration()
@ComponentScan()
public class ApplicationMain{
    public static void main(String[] args) {
       new SpringApplication(ApplicationMain.class).run();
    }
}

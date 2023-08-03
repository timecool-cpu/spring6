package com.atguigu.java6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangyingmiao <1500805849@qq.com>
 * Created on @date 2023/8/3
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //by id
        User user = (User)context.getBean("user");
        System.out.println(user);
    }
}

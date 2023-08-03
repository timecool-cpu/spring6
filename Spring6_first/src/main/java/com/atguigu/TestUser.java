package com.atguigu;

import com.atguigu.spring6.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangyingmiao <1500805849@qq.com>
 * Created on @date 2023/8/3
 */
public class TestUser {

    @Test
    public void testUserObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User)context.getBean("user");
        System.out.println(user);

        user.add();
    }

    @Test
    public void testUserObject1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.atguigu.spring6.User");
//        aClass.newInstance();
        // 调用方法创建对象
        Object newInstance = aClass.getDeclaredConstructor().newInstance();

    }
}

package com.atguigu.spring6;

/**
 * @author zhangyingmiao <1500805849@qq.com>
 * Created on @date 2023/8/3
 */
public class User {
    public User() {
        System.out.println("User's constructor...");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}

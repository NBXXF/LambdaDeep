package com.xxf.lambda.java8features;

/**
 * com.xxf.lambda.java8features
 * 2018/9/19
 * author:asange
 * email:xuanyouwu@163.com
 **/
public interface IUser {
    static void say() {
        System.out.println("say_" + IUser.class);
    }

    default void eat() {
        System.out.println("eat_" + IUser.class);
    }
}

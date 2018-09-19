package com.xxf.lambda.java8features;

/**
 * com.xxf.lambda.java8features
 * 2018/9/19
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class Student implements IUser, IStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
    }


    @Override
    public void eat() {
        IUser.super.eat();
    }
}

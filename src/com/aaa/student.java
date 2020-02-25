package com.aaa;

public class student implements People {

    @Override
    public void say() {
        System.out.println("say--->hello");
    }

    public static void main(String[] args) {
        People stu = new student();
        stu.say();
    }
}

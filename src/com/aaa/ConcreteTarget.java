package com.aaa;

public class ConcreteTarget implements Target {
    /**
     * 怎样使目标接口中的request()调用adaptee中的adapteeRequest()方法呢
     * 直接实现Target方法是不行的
     */
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}

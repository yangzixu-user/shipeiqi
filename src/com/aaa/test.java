package com.aaa;

public class test {
    public static void main(String[] args) {
        Target  target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

package com.aaa.jmm;


import com.sun.javaws.jnl.IconDesc;
import com.sun.org.apache.bcel.internal.classfile.Code;

class CodeZY{
    public CodeZY(){
        System.out.println("code的构造方法1111");
    }
    {
        System.out.println("code的构造块2222");
    }
    static {
        System.out.println("code的静态代码块3333");
    }
}
public class T2 {//主类 T2.class ----> main
    {
        System.out.println("T2的构造块4444");
    }
    static {
        System.out.println("T2的静态代码块5555");
    }
    public  T2(){
        System.out.println("T2的构造方法6666");
    }
    public static void main(String[] args) {
        System.out.println("===我是最美分割线----------T2的main方法7777");
        //5555
        new CodeZY();
        //7777 3333 2222   1111
        System.out.println("-----------------");
        new CodeZY();
        //2222 1111
        System.out.println("-----------------");
        new T2();
        //4444 6666
    }
}

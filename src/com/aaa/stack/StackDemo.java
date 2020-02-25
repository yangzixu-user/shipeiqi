package com.aaa.stack;

import java.util.Random;

public class StackDemo {
    public static void main(String[] args) {
       /* long maxMemory = Runtime.getRuntime().maxMemory();//返回Java虚拟机视图使用的最大内存量。
        long totalMemory = Runtime.getRuntime().totalMemory();//返回java虚拟机中的内存总量。
        System.out.println(" MAX_MEMORY = "+ maxMemory + " （字节）、" + (maxMemory / 1024 / 1024 ) +"MB");
        System.out.println(" TOTAL_MEMORY = "+ totalMemory + " （字节）、" + (totalMemory / 1024 / 1024 ) +"MB");*/
       String str = "YangZiXu";
       while (true)
       {
           str += str + new Random().nextInt(8888888) + new Random().nextInt(9999999  );
       }
//        System.out.println("核数"+Runtime.getRuntime().availableProcessors());
//        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()+"字节,"+(Runtime.getRuntime().maxMemory()/1024/1024)+"MB");
//
//        System.out.println("-Xms"+Runtime.getRuntime().totalMemory()+"字节,"+(Runtime.getRuntime().totalMemory()/1024/1024)+"MB");
//            Byte[] bytes = new Byte[1024*1024*1024];
    }


}
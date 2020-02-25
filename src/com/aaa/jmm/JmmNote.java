package com.aaa.jmm;

    class MyNumber{
       volatile int  number = 10;
         public void  addTo1024(){
             this.number=1024;
    }
}
public class JmmNote {


    public static void main(String[] args) {
       MyNumber myNumber = new MyNumber();

       new Thread(() -> {
           System.out.println(Thread.currentThread().getName()+"****************come in ");
           try {
               Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
                myNumber.addTo1024();//将10修改为1024
           System.out.println(Thread.currentThread().getName()+"\t update number ,number value " + myNumber.number);
           System.out.println(Thread.currentThread().getName()+"\t update number ,number value " + myNumber.number);
       },"AAA").start();
       while (myNumber.number == 10){
            //需要一种通知机制告诉main线程   number的值已经修改为1024了
       }
        System.out.println(Thread.currentThread().getName()+"\t mission is over");
    }


}

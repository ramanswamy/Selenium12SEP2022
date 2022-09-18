package com.tekparams.accessmodifiersdemo;

public class ArithmeticOperations3 {
    public int a;
    public int b;
    public int total;

    public void addition(){
        total = a+b;
    }
    public void printResult(){
        System.out.println("the sum is :"+total);
    }
    public ArithmeticOperations3(){
        a=100;
        b=200;
    }

}

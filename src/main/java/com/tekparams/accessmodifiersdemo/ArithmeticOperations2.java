package com.tekparams.accessmodifiersdemo;

public class ArithmeticOperations2 {
    protected int a;
    protected int b;
    protected int total;

    protected void addition(){
        total = a+b;
    }
    protected void printResult(){
        System.out.println("the sum is :"+total);
    }
    protected ArithmeticOperations2(){
        a=100;
        b=200;
    }
}

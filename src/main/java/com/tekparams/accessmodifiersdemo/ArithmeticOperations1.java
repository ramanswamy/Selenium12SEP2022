package com.tekparams.accessmodifiersdemo;

public class ArithmeticOperations1 {
    // Default access Modifer
    int a;
    int b;
    int total;

    // Default access modifier
    void addition(){
        total = a+b;
    }
    void printResult(){
        System.out.println("the sum is :"+total);
    }
    ArithmeticOperations1(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmeticOperations1 obj1 = new ArithmeticOperations1();
        obj1.addition();
        obj1.printResult();
    }
}

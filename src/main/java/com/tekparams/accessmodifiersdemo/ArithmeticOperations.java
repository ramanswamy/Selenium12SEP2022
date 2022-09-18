package com.tekparams.accessmodifiersdemo;

public class ArithmeticOperations {
    private int a;
    private int b;
    private int total;

    private void addition(){
        total = a+b;
    }
    private void printResult(){
        System.out.println("the sum is :"+total);
    }
    ArithmeticOperations(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmeticOperations obj1 = new ArithmeticOperations();
        obj1.addition();
        obj1.printResult();
    }
}
class test1{
    // Example for accessing private access data members and methods
    ArithmeticOperations obj2 = new ArithmeticOperations();
    //obj2.
}
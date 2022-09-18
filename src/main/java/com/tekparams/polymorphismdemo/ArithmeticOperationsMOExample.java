package com.tekparams.polymorphismdemo;

public class ArithmeticOperationsMOExample {
    int total=0;
    Double total1=0.0;

    int add(int a,int b){
        total=a+b;
        return total;
    }
    int add(int a,int b,int c){
        total=a+b+c;
        return total;
    }
    Double add(Double a,Double b){
        total1 =a+b;
        return total1;
    }

    public static void main(String[] args) {
        ArithmeticOperationsMOExample obj1 = new ArithmeticOperationsMOExample();
        int varTotal = obj1.add(10,10);
        System.out.println(varTotal);
        Double varTotal1=obj1.add(7863.87,6875.87);
        System.out.println(varTotal1);
        int varTotal2=obj1.add(76,76,89);
        System.out.println(varTotal2);
    }
}

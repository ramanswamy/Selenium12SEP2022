package com.tekparams.OOPS;


import com.tekparams.accessmodifiersdemo.ArithmeticOperations3;

public class PublicAccessModifierDemo {
    public static void main(String[] args){
        ArithmeticOperations3 arithmeticOperations3 = new ArithmeticOperations3();
        arithmeticOperations3.a=800;
        arithmeticOperations3.b=900;
        arithmeticOperations3.addition();
        arithmeticOperations3.printResult();
    }
}

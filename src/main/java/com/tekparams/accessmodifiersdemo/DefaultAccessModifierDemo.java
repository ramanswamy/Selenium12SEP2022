package com.tekparams.accessmodifiersdemo;
import com.tekparams.accessmodifiersdemo.ArithmeticOperations1;

public class DefaultAccessModifierDemo {
    public static void main(String[] args) {
        ArithmeticOperations1 arithmeticOperations1 = new ArithmeticOperations1();

        //ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        arithmeticOperations1.a=500;
        arithmeticOperations1.b=600;
        arithmeticOperations1.addition();
        arithmeticOperations1.printResult();
    }



}

package com.tekparams.OOPS;

import com.tekparams.accessmodifiersdemo.ArithmeticOperations2;

public class ProtectedAccessModifierDemo extends ArithmeticOperations2 {

    public static void main(String[] args){
        ProtectedAccessModifierDemo obj = new ProtectedAccessModifierDemo();
        obj.a=700;
        obj.b=800;
        obj.addition();
        obj.printResult();
    }
}

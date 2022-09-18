package com.tekparams.OOPS;

import com.tekparams.inheritancedemo.Employee;

public class Developer extends Employee {
    Double bonus=20000.00;

    void printBonus(){
        System.out.println(bonus);
    }

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.printEmployee();
        developer.printBonus();
    }
}

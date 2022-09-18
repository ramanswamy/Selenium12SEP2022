package com.tekparams.inheritancedemo;

public class Employee {
    protected int empNo=100;
    protected String empName="Suresh";
    protected Double basiSalary=50000.00;

    protected void printEmployee(){
        System.out.println(empNo+"\n"+empName+"\n"+basiSalary);
    }

}

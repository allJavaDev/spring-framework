package com.cydeo;

public class Calculator {

    public static int addNumbers(int a, int b){
        return a+b;
    }

    public static int throwsMethod(int num1, int num2){
        if(num1>num2) throw new IllegalArgumentException();
        else return num1+num2;

    }
}

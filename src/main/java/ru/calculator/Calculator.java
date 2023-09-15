package ru.calculator;

public class Calculator {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Java";
        int  age = 6;
        Calculator.hello(name, age);
        Calculator.hello(name, age);
        Calculator.hello(String.valueOf(age), age);
        Calculator.hello(String.valueOf(age), name);
        Calculator.hello(name, age);
    }

    private static void hello(String name, String name1) {
    }


}

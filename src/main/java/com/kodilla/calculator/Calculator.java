package com.kodilla.calculator;

public class Calculator {

    public void sum() {
        System.out.println("Dodawanie");
    }

    public void min() {
        System.out.println("Odejmowanie");
    }


    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.sum();
    calculator.min();
    }
}
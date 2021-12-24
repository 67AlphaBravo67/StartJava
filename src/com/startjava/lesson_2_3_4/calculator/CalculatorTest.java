package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите математическое выражение");
            calc.calculate(console.nextLine());
            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = console.nextLine();
            } while (!answer.equals("yes") && (!answer.equals("no")));
        }
    }
}

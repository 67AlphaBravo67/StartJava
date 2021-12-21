package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите математическое выражение");
            calc.setS(console.nextLine()); // Ввод выражения
            System.out.println("Введенное математическое выражение = " + calc.getS());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = console.nextLine();
            } while (!answer.equals("yes") && (!answer.equals("no")));
        }
    }
}

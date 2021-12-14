package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите первое число");
            calc.setA(console.nextInt());
            System.out.println("Первое введённое число: " + calc.getA());
            System.out.println("Выберите математическое действие");
            calc.setMathAction(console.next().charAt(0));
            System.out.println("Выбранное действие: " + calc.getMathAction());
            System.out.println("Введите второе число: ");
            calc.setB(console.nextInt());
            System.out.println("Второе введённое число: " + calc.getB());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = console.next();
            } while (!answer.equals("yes") && (!answer.equals("no")));
        }
    }    
}

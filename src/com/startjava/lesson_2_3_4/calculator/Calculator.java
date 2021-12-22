package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    private int a;
    private int b;
    private char mathAction;
    public String mathExpression;
    Scanner sc = new Scanner(System.in);

    public void calculate() {
        mathExpression = sc.nextLine();
        String[] arrExpression = mathExpression.split(" ");
        a = Integer.parseInt(arrExpression[0]);
        mathAction = arrExpression[1].charAt(0);
        b = Integer.parseInt(arrExpression[2]);

        System.out.println("Первое введённое число: " + a);
        System.out.println("Выбранное действие: " + mathAction);
        System.out.println("Второе введённое число: " + b);

        switch (mathAction) {
            case '+' -> System.out.println("Результат: " + (a + b));
            case '-' -> System.out.println("Результат: " + (a - b));
            case '*' -> System.out.println("Результат: " + (a * b));
            case '/' -> System.out.println("Результат: " + (a / b));
            case '%' -> System.out.println("Результат: " + (a % b));
            case '^' -> System.out.println("Результат: " + Math.pow(a, b));
        }
    }
}

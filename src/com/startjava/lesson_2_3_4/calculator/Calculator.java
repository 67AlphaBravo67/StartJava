package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    private int a;
    private int b;
    private char mathAction;
    public String mExpression;

    Scanner sc = new Scanner(System.in);
    public void calculate() {
        mExpression = sc.nextLine();
        String[] arrayExpression = mExpression.split(" "); // Отделяем символы и передаем в массив
        a = Integer.parseInt(arrayExpression[0]);
        mathAction = arrayExpression[1].charAt(0);
        b = Integer.parseInt(arrayExpression[2]);

    System.out.println("Первое введённое число: " + a);
    System.out.println("Выбранное действие: " + mathAction);
    System.out.println("Второе введённое число: " + b);
    double x = a;
    double y = b;

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

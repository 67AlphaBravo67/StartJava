package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char mathAction;
    private String s;

    public int getA() {
        return a;
    }

    public void setA(int calc) {
        this.a = calc;
    }

    public int getB() {
        return b;
    }

    public void setB(int calc) {
        this.b = calc;
    }

    public char getMathAction() {
        return mathAction;
    }

    public void setMathAction(char calc) {
        this.mathAction = calc;
    }

    public String getS() { return s ; }

    public void setS(String s) { this.s = s; }

    public void calculate() {

    String str = getS(); // Передача значения выражения в переменную str типа String
    String[] string = str.split(" "); // Отделяем символы и передаем в массив
    a = Integer.parseInt(string[0]);
    mathAction = string[1].charAt(0);
    b = Integer.parseInt(string[2]);

    System.out.println("Первое введённое число: " + a);
    System.out.println("Выбранное действие: " + mathAction);
    System.out.println("Второе введённое число: " + b);

        switch (mathAction) {
            case '+' -> System.out.println("Результат: " + (a + b));
            case '-' -> System.out.println("Результат: " + (a - b));
            case '*' -> System.out.println("Результат: " + (a * b));
            case '/' -> System.out.println("Результат: " + (a / b));
            case '%' -> System.out.println("Результат: " + (a % b));
            case '^' -> {
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println("Результат: " + result);
            }
        }
    }
}
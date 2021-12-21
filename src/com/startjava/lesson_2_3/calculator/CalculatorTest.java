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
            System.out.println(calc.getS());
            String string = calc.getS(); // Передача значения выражения в переменную string
            String[] string1 = string.split(" "); // Отделяем символы и передаем в массив
            //System.out.println("Введите первое число");
            calc.setA(Integer.parseInt(string1[0])); // Преобразоваие числа в Integer
            System.out.println("Первое введённое число: " + calc.getA());
            System.out.println("Выберите математическое действие");
            calc.setMathAction(string1[1].charAt(0)); // Преобразование знака  действия в char
            System.out.println("Выбранное действие: " + calc.getMathAction());
            //System.out.println("Введите второе число: ");
            calc.setB(Integer.parseInt(string1[2])); // Преобразование второго числа в Integer
            System.out.println("Второе введённое число: " + calc.getB());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = console.next();
            } while (!answer.equals("yes") && (!answer.equals("no")));
        }
    }
}

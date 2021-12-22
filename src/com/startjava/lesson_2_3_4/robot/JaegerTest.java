package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("GipsyDanger", "mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        System.out.println("Характеристика робота " + jaegerOne.getName());
        System.out.println("Модель: " + jaegerOne.getName());
        System.out.println("Марка: " + jaegerOne.getMark());
        System.out.println("Страна происхождения: " + jaegerOne.getOrigin());
        System.out.println("Высота: " + jaegerOne.getHeight());
        System.out.println("Масса: " + jaegerOne.getWeight());
        System.out.println("Модель: " + jaegerOne.getSpeed());
        System.out.println("Сила: " + jaegerOne.getStrength());
        System.out.println("Вооружение: " + jaegerOne.getArmor());
        jaegerOne.shoot();
        jaegerOne.fly();
        jaegerOne.swim();

        Jaeger jaegerTwo = new Jaeger("ChernoAlpha", "mark-1", "RUSSIA", 85.34f, 2.412f, 3, 10, 10);
        System.out.println("\n\nХарактеристика робота " + jaegerTwo.getName());
        System.out.println("Модель: " + jaegerTwo.getName());
        System.out.println("Марка: " + jaegerTwo.getMark());
        System.out.println("Страна происхождения: " + jaegerTwo.getOrigin());
        System.out.println("Высота: " + jaegerTwo.getHeight());
        System.out.println("Масса: " + jaegerTwo.getWeight());
        System.out.println("Модель: " + jaegerTwo.getSpeed());
        System.out.println("Сила: " + jaegerTwo.getStrength());
        System.out.println("Вооружение: " + jaegerTwo.getArmor());
        jaegerTwo.drift();
        jaegerTwo.fly(); 
        jaegerTwo.shoot();
        jaegerTwo.swim();

        Jaeger jaegerThree = new Jaeger("Crimson Typhoon", "mark-4", "CHINA", 76.2f, 1722f, 9, 8, 6);
        System.out.println("\n\nХарактеристика робота " + jaegerThree.getName());
        System.out.println("Модель: " + jaegerThree.getName());
        System.out.println("Марка: " + jaegerThree.getMark());
        System.out.println("Страна происхождения: " + jaegerThree.getOrigin());
        System.out.println("Высота: " + jaegerThree.getHeight());
        System.out.println("Масса: " + jaegerThree.getWeight());
        System.out.println("Модель: " + jaegerThree.getSpeed());
        System.out.println("Сила: " + jaegerThree.getStrength());
        System.out.println("Вооружение: " + jaegerThree.getArmor());
        jaegerTwo.fly();
        jaegerTwo.shoot();
        jaegerTwo.swim();
    }
}

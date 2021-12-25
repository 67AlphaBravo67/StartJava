package com.startjava.lesson_2_3_4.game;
import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player player3;

    public GuessNumber(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Случайное число(Для проверки) " + targetNumber);
        int numberOfAttempts = 0;
        do {
            if (numberOfAttempts == 9) {
                System.out.println("ВНИМАНИЕ, игроки. Осталось по одной попытке.");
            }
            System.out.println(player1.getName() + ", введите число.");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == targetNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() +
                        " с " + numberOfAttempts + "-ой попытки");
                break;
            } else if (numberOfAttempts == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки.");
            } else if (player1.getNumber() > targetNumber) {
                System.out.println("Число больше загаданного.");
            } else if (player1.getNumber() < targetNumber) {
                System.out.println("Число меньше загаданного.");
            }


            System.out.println(player2.getName() + ", введите число.");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == targetNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() +
                        " с " + numberOfAttempts + "-ой попытки");
                break;
            } else if (numberOfAttempts == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки.");
            } else if (player2.getNumber() > targetNumber) {
                System.out.println("Число больше загаданного.");
            } else if (player2.getNumber() < targetNumber) {
                System.out.println("Число меньше загаданного.");
            }


            System.out.println(player3.getName() + ", введите число.");
            player3.setNumber(scanner.nextInt());
            if (player3.getNumber() == targetNumber) {
                System.out.println("Игрок " + player3.getName() + " угадал число " + player3.getNumber() +
                        " с " + numberOfAttempts + "-ой попытки");
                break;
            } else if (numberOfAttempts == 9) {
                System.out.println("У " + player3.getName() + " закончились попытки.");
            } else if (player3.getNumber() > targetNumber) {
                System.out.println("Число больше загаданного.");
            } else if (player3.getNumber() < targetNumber) {
                System.out.println("Число меньше загаданного.");
            }
            numberOfAttempts++;
        } while (numberOfAttempts < 10);
    }
}


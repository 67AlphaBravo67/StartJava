package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("!!!У КАЖДОГО ИГРОКА ТОЛЬКО 10 ПОПЫТОК!!!");
            Scanner console = new Scanner(System.in);
            System.out.println("Введите имя первого игрока.");
            Player player1 = new Player(console.next());
            System.out.println("Имя первого игрока: " + player1.getName());
            System.out.println("Введите имя второго игрока.");
            Player player2 = new Player(console.next());
            System.out.println("Имя второго игрока: " + player2.getName());
            System.out.println("Введите имя третьего игрока.");
            Player player3 = new Player(console.next());
            System.out.println("Имя третьего игрока: " + player3.getName());
            GuessNumber game = new GuessNumber(player1, player2, player3);
            game.launch();
            do {
                answer = console.nextLine();
                System.out.println("Продолжить вычисления?");
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
        }
}
package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {  // Констуктор создания игроков
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setEnteredNumbers(int enteredNumbers) {
    }
}



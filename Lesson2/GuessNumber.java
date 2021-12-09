import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private double rand;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void compare() {
        Scanner scanner = new Scanner(System.in);
        rand = (int)(0 + (Math.random() * 100) + 1);       
        System.out.println(player1.getName() + ", введите угадываемое число");
        player1.setNumber(scanner.nextInt());
        
        if (rand == player1.getNumber()) {
            System.out.println("Поздравляю, число " + player1.getNumber() + " угадано, выиграл первый игрок");
            } else if (rand > player1.getNumber()) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        
        System.out.println(player2.getName() + ", введите угадываемое число");
        player2.setNumber(scanner.nextInt());
        if (rand == player2.getNumber()) {
            System.out.println("Поздравляю, " + player2.getNumber() + " угадано,выиграл первый игрок");
            } else if (rand > player1.getNumber()) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        System.out.println("Загаданное число компьютером: " + rand);

    }
}
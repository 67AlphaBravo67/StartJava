import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private double targetNumber;
    public int numberOfAttempts = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        targetNumber = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое для угадывания число");
        player1.setNumber(scanner.nextInt());
        System.out.println("Введите второе для угадывания число");
        player2.setNumber(scanner.nextInt());
        while ((player1.getNumber() != targetNumber) || (player2.getNumber() != targetNumber)) {
            numberOfAttempts = numberOfAttempts + 1;
            targetNumber = (int)((Math.random() * 100) + 1);
                if (player1.getNumber() == targetNumber) {
                    System.out.println("Поздравляю! Число угадано, выиграл первый игрок");            
                    System.out.println("Проверьте себя, компьютер загадал число: " + targetNumber);
                    break;
                } else if (player1.getNumber() < targetNumber) {
                    System.out.println("Данное число (" + player1.getNumber() + ") меньше того, что загадал компьютер");
                } else if (player1.getNumber() > targetNumber) {
                    System.out.println("Данное число (" + player1.getNumber() + ") больше того, что загадал компьютер" + targetNumber);
                } else if (player2.getNumber() == targetNumber) {
                    System.out.println("Поздравляю! Число угадано, выиграл второй игрок");
                    break;
                } else if (player2.getNumber() < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");            
                } else {
                    System.out.println("Данное число больше того, что загадал компьютер");
                }
        }
        System.out.println("Общее количество попыток:" + numberOfAttempts);
    }
}
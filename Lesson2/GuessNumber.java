import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    public int numberOfAttempts;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int)((Math.random() * 100) + 1);
        System.out.println("Случайное число(Для проверки) " + targetNumber);
        do {
                System.out.println("Число, введенное первым игроком.");
                numberOfAttempts++;
                player1.setNumber(scanner.nextInt());
                if (player1.getNumber() == targetNumber) {
                    System.out.println("Выиграл первый игрок");
                    break;
                    } else if (player1.getNumber() > targetNumber) {
                            System.out.println("Число больше загаданного");
                    }else if (player1.getNumber() < targetNumber) {
                            System.out.println("Число меньше загаданного");
                    }

                System.out.println("Число, введенное вторым игроком.");
                player2.setNumber(scanner.nextInt());
                if (player2.getNumber() == targetNumber) {
                    System.out.println("Выиграл второй игрок");
                    break;
                    } else if (player2.getNumber() > targetNumber) {
                            System.out.println("Число больше загаданного");
                    }else if (player2.getNumber() < targetNumber) {
                            System.out.println("Число меньше загаданного");
                    }
        } while ((player1.getNumber() != targetNumber) || (player2.getNumber() != targetNumber));
        System.out.println("Общее число попыток " + numberOfAttempts);
    }
}
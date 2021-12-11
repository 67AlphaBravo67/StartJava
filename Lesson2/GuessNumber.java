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
            numberOfAttempts++;
                System.out.println("Число, введенное первым игроком.");
                player1.setNumber(scanner.nextInt());
                if (player1.getNumber() == targetNumber) {
                    System.out.println("Выиграл первый игрок");
                    break;
                }
                    System.out.println("Число, введенное вторым игроком.");
                    player2.setNumber(scanner.nextInt());
                    if (player2.getNumber() == targetNumber) {
                    System.out.println("Выиграл второй игрок");
                    break;
                }
        } while ((player1.getNumber() != targetNumber) || (player2.getNumber() != targetNumber));
        System.out.println("Общее число попыток " + numberOfAttempts);
    }
}
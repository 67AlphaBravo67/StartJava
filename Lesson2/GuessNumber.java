import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player player3;

    private int targetNumber;
    private int numberOfAttempts;

    public GuessNumber(Player player1, Player player2,Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Случайное число(Для проверки)" + targetNumber);
        do {
            System.out.println(player1.getName() + ", введите число.");
            numberOfAttempts++;
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == targetNumber) {
                System.out.println("Выиграл первый игрок по имени " + player1.getName());
                break;
                } else if (player1.getNumber() > targetNumber) {
                        System.out.println("Число больше загаданного.");
                } else if (player1.getNumber() < targetNumber) {
                        System.out.println("Число меньше загаданного.");
                }
            System.out.println(player2.getName() + ", введите число.");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == targetNumber) {
                System.out.println("Выиграл второй игрок по имени " + player2.getName());
                break;
                } else if (player2.getNumber() > targetNumber) {
                        System.out.println("Число больше загаданного.");
                } else if (player2.getNumber() < targetNumber) {
                        System.out.println("Число меньше загаданного.");
                }
            System.out.println(player3.getName() + ", введите число.");
            if (player3.getNumber() == targetNumber) {
                System.out.println("Выиграл третий игрок по имени " + player3.getName());
                break;
                } else if (player3.getNumber() > targetNumber) {
                        System.out.println("Число больше загаданного.");
                } else if (player3.getNumber() < targetNumber) {
                        System.out.println("Число меньше загаданного.");
                }
        } while (true);
        System.out.println("Общее число попыток " + numberOfAttempts);
    }
}
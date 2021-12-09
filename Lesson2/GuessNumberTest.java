import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String = "";
        while (!answer.equals("no")) {
            System.out.println("Введите имя первого игрока");
            Player player1 = new Player(sc.next());
            System.out.println("Имя первого игрока: " + player1.getName());
            System.out.println("Введите имя второго игрока");
            Player player2 = new Player(sc.next());
            System.out.println("Имя второго игрока: " + player2.getName());
            GuessNumber game = new GuessNumber(player1, player2);
            game.compare();
            do {
                System.out.println("Продолжить вычисления?")
                answer = sc.next();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
    }
}
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer = "";
        while (!answer.equals("no")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя первого игрока");
            Player player1 = new Player(sc.next());
            //System.out.println("Имя первого игрока: " + player1.getName());
            System.out.println("Введите имя второго игрока");
            Player player2 = new Player(sc.next());
            //System.out.println("Имя второго игрока: " + player2.getName());
            GuessNumber game = new GuessNumber(player1, player2);
            game.launch();
            do {
                System.out.println("Продолжить вычисления?");
                answer = sc.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
    }
}
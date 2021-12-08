import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
     public void calculate() {

        // Вычисления
        private int guess;

        public int getGuess() {
            return guess;
        }

        public void setGuess(int guess) {
            this.guess = guess;
        }

        Random rand = new Random();
        private double random;
        random = (int)((rand() * 100) + 1);
        if (rand == getGuess()) {
            System.out.println("Поздравляю, число " + guess + " угадано");
                break;    
        } else if (rand > guess) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (rand < guess) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
    }
}


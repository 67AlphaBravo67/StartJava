public class SimpleGame {
    public static void main(String[] args) {
        int guess = 67;
        for (int j = 0; j <= 100; j++) {
            if (j == guess) {
                System.out.println("Поздравляю, число " + j + " угадано");
                    break;    
            } else if (j > guess) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (j < guess) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}

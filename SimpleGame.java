public class SimpleGame {
    public static void main(String[] args) {

        int guess = 39;
        for(int j = 0;j <= 100;j += 3) {
        if (j == guess)
        {
            System.out.println("Поздравляю, число " + j +  " угадано");
            break;    
        } 

        else if (j > guess)
        {
            System.out.println("Данное число больше того, что загадал компьютер");
        } 
        
        else 
        {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
    }
}

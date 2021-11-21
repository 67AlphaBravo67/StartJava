public class Cycles {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {        
            System.out.println("Число: " + i);          
        }
        
        // Вывод чисел диапазона[-6;6]
        int j =- 6;                         
        while (j <= 6) {
            System.out.println("Число: " + j);           
            j += 2;
        }
        
        // Вывод суммы нечетных чисел [10;20]
        int y = 10; 
        int sum = 0;                    
        do { 
            if (y % 2 == 1) {
                sum += y;
            } y++;
        } while (y < 20);
        System.out.println("Сумма нечетных чисел: " + sum);
    }
}
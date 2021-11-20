public class Cycles {
    public static void main(String [] args) {

//Вывод чисел 
        for (int i = 0;i < 21;i++) {        
            System.out.println(i);          
        }

//Вывод чисел диапазона[-6;6]
        int j =- 6;                         
        while(j <= 6) {
            System.out.println(j);           
            j+=2;
        }

//Вывод суммы нечетных чисел [10;20]
        int y = 10;                     
        do { 
            if (y % 2 == 1) {
                sum = sum + y ;
            }   y++;
        }while(y < 20);
        System.out.println("Сумма нечетных чисел: " + sum);
    }
}
public class Cycles {
    public static void main(String [] args) {
        for (int i=0;i<21;i++) {
            System.out.println(i);
        //Вывод чисел    
        }        
        int j=-6;
        while(j<=6) {
            System.out.println(j);
            j+=2;
        }
        //подсчет суммы
        int y=10;
        int sum=0;
        do{ 
            sum+=y+1;
            y+=2;
        }while(y<20);
        System.out.println(sum);
    }
}
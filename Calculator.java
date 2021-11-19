import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
// Иницилизация переменных         
        Scanner insert = new Scanner(System.in);
        System.out.println("Введите первое число");
        int numberOne = insert.nextInt();
        System.out.println("Первое введённое число: " + numberOne);
        System.out.println("Введите второе число");
        int numberTwo = insert.nextInt();
        System.out.println("Первое введённое число: " + numberTwo);
        System.out.println("Выберите математическое действие");
        System.out.print("Выбранное действие:" );
        char mathAction = insert.next().charAt(0);
// Переменные математических действий        
        int plus=numberOne+numberTwo;
        int minus=numberOne-numberTwo;
        int multiplication=numberOne*numberTwo;
        int division=numberOne/numberTwo;
        int remainder=numberOne%numberTwo;
        int result = 1;
        for(int i = 1;i<=numberTwo;i++) {
            result=result*numberOne;
        }
//Выбор математического действия
        if (mathAction =='+') {
            System.out.println("Результат: " + plus);
        } 
        if (mathAction =='-') {
            System.out.println("Результат: " + minus);
        } 
        if (mathAction =='*') {
            System.out.println("Результат: " + multiplication);
        }
        if (mathAction =='/') {
            System.out.println("Результат: " + division);
        } 
        if (mathAction =='%') {
            System.out.println("Результат: " + remainder);
        }
        if (mathAction =='^') {
            System.out.println("Результат: " + result);
        }
    }             
}



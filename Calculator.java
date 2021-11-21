import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Первое введённое число: " + a);
        System.out.println("Введите второе число");
        int b = console.nextInt();
        System.out.println("Первое введённое число: " + b);
        System.out.println("Выберите математическое действие");
        System.out.print("Выбранное действие:");
        char mathAction = console.next().charAt(0);

        // Выбор математического действия
        if (mathAction == '+') {
            int plus = a + b;
            System.out.println("Результат: " + plus);
        } else if (mathAction == '-') {
            int minus = a - b;
            System.out.println("Результат: " + minus);
        } else if (mathAction == '*') {
            int multiplication = a * b;
            System.out.println("Результат: " + multiplication);
        } else if (mathAction == '/') {
            int division = a / b;
            System.out.println("Результат: " + division);
        } else if (mathAction == '%') {
            int remainder = a % b;
            System.out.println("Результат: " + remainder);
        } else if (mathAction == '^') {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result = result * a;    
            }
            System.out.println("Результат: " + result);
        }
    }
}



import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcFirst = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            System.out.println("Введите первое число");
            calcFirst.setA(console.nextInt());
            System.out.println("Первое введённое число: " + calcFirst.getA());
            System.out.println("Выберите математическое действие");
            calcFirst.setMathAction(console.next().charAt(0));
            System.out.println("Выбранное действие: " + calcFirst.getMathAction());
            System.out.println("Введите второе число");
            calcFirst.setB(console.nextInt());
            System.out.println("Второе введённое число: " + calcFirst.getB());
            calcFirst.calculating();
            do {
                System.out.println("Хотите продолжить вычисления?");
                answer = console.next();
            } while (!answer.equals("yes") && (!answer.equals("no")));
        }
    }    
}

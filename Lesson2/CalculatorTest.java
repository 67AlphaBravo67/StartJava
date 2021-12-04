import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcFirst = new Calculator();
        private int a;
        private int b;
        private char mathAction;

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public char getMathAction() {
            return mathAction;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public void setMathAction(char mathAction) {
            this.mathAction = mathAction;
        }
      
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        calcFirst.setA(console.nextInt());
        System.out.println("Первое введённое число: " + calcFirst.getA());
        System.out.println("Введите второе число");
        calcFirst.setB(console.nextInt());
        System.out.println("Второе введённое число: " + calcFirst.getB());
        System.out.println("Выберите математическое действие");
        calcFirst.setMathAction(console.next().charAt(0));
        System.out.print("Выбранное действие:" + calcFirst.getMathAction());        
        Calculator.calculating();
    }
}
public class Calculator {

    private int a;
    private int b;
    private char mathAction;

    public int getA() {
        return a;
    }

    public void setA(int calc) {
        this.a = calc;
    }

    public int getB() {
        return b;
    }

    public void setB(int calc) {
        this.b = calc;
    }

    public char getMathAction() {
        return mathAction;
    }

    public void setMathAction(char calc) {
        this.mathAction = calc;
    }

    public void calculate() {
        switch (mathAction) {
            case ('+') :
                System.out.println("Результат: " + (a + b));
                break;    
            case ('-') :
                System.out.println("Результат: " + (a - b));
                break;
            case ('*') :
                System.out.println("Результат: " + (a * b));
                break;
            case ('/') :
                System.out.println("Результат: " + (a / b));
                break;
            case ('%') :
                System.out.println("Результат: " + (a % b));
                break;
            case ('^') :
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println("Результат: " + result);
                break;    
        }
    }
}
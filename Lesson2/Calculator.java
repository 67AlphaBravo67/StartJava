public class Calculator {

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

    public void setA(int calcFirst) {
        this.a = calcFirst;
    }

    public void setB(int calcFirst) {
        this.b = calcFirst;
    }

    public void setMathAction(char calcFirst) {
        this.mathAction = calcFirst;
    }

        // Выбор математического действия
    public void calculating() {
        switch (getMathAction()) {
            case ('+') :
            System.out.println("Результат: " + (getA() + getB()));
                break;    
            case ('-') :
            System.out.println("Результат: " + (getA() - getB()));
                break;
            case ('*') :
            System.out.println("Результат: " + (getA() * getB()));
                break;
            case ('/') :
            System.out.println("Результат: " + (getA() / getB()));
                break;
            case ('%') :
            System.out.println("Результат: " + (getA() % getB()));
                break;
            case ('^') :
            int result = 1;
            for (int i = 1; i <= getB(); i++) {
                result = result * getA();
            }
            System.out.println("Результат: " + result);
                break;    
            }
    }
}



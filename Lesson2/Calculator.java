public class Calculator {
    public void calculating() {
        
        // Выбор математического действия
        switch (calcFirst.getMathAction()) {
            case ('+') :
            System.out.println("Результат: " + (calcFirst.getA() + calcFirst.getB()));
                break;
            case ('-') :
            System.out.println("Результат: " + (calcFirst.getA() - calcFirst.getB()));
                break;
            case ('*') :
            System.out.println("Результат: " + (calcFirst.getA() * calcFirst.getB()));
                break;
            case ('/') :
            System.out.println("Результат: " + (calcFirst.getA() / calcFirst.getB()));
                break;
            case ('%') :
            System.out.println("Результат: " + (calcFirst.getA() % calcFirst.getB()));
                break;
            case ('^') :
            int result = 1;
            for (int i = 1; i <= calcFirst.getB(); i++) {
                result = result * calcFirst.getA();
            }
            System.out.println("Результат: " + result);
                break;    
        }
    }
}



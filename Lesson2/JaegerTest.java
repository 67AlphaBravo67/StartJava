public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("GipsyDanger");
        System.out.println("Характеристика робота " + jaegerOne.getName());
        System.out.println("Модель: " + jaegerOne.getName());
        jaegerOne.setMark("mark-3");
        System.out.println("Марка: " + jaegerOne.getMark());
        jaegerOne.setOrigin("USA");
        System.out.println("Страна происхождения: " + jaegerOne.getOrigin());
        jaegerOne.setHeight(79.25f);
        System.out.println("Высота: " + jaegerOne.getHeight());
        jaegerOne.setWeight(1.980f);
        System.out.println("Масса: " + jaegerOne.getWeight());
        jaegerOne.setSpeed(7);
        System.out.println("Модель: " + jaegerOne.getSpeed());
        jaegerOne.setStrength(8);
        System.out.println("Сила: " + jaegerOne.getStrength());
        jaegerOne.setArmor(6);
        System.out.println("Вооружение: " + jaegerOne.getArmor());
        jaegerOne.shoot();jaegerOne.fly();jaegerOne.swim();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setName("Cherno Alpha");
        System.out.println("\n\nХарактеристика робота " + jaegerTwo.getName());
        System.out.println("Модель: " + jaegerTwo.getName());
        jaegerTwo.setMark("mark-1");
        System.out.println("Марка: " + jaegerTwo.getMark());
        jaegerTwo.setOrigin("RUSSIA");
        System.out.println("Страна происхождения: " + jaegerTwo.getOrigin());
        jaegerTwo.setHeight(85.34f);
        System.out.println("Высота: " + jaegerTwo.getHeight());
        jaegerTwo.setWeight(2.412f);
        System.out.println("Масса: " + jaegerTwo.getWeight());
        jaegerTwo.setSpeed(3);
        System.out.println("Модель: " + jaegerTwo.getSpeed());
        jaegerTwo.setStrength(10);
        System.out.println("Сила: " + jaegerTwo.getStrength());
        jaegerTwo.setArmor(10);
        System.out.println("Вооружение: " + jaegerTwo.getArmor());
        jaegerTwo.drift(); jaegerTwo.fly(); jaegerTwo.shoot();jaegerTwo.swim();

        Jaeger jaegerThree = new Jaeger();
        jaegerThree.setName("Crimson Typhoon");
        System.out.println("\n\nХарактеристика робота " + jaegerThree.getName());
        System.out.println("Модель: " + jaegerThree.getName());
        jaegerThree.setMark("mark-4");
        System.out.println("Марка: " + jaegerThree.getMark());
        jaegerThree.setOrigin("CHINA");
        System.out.println("Страна происхождения: " + jaegerThree.getOrigin());
        jaegerThree.setHeight(76.2f);
        System.out.println("Высота: " + jaegerThree.getHeight());
        jaegerThree.setWeight(1722f);
        System.out.println("Масса: " + jaegerThree.getWeight());
        jaegerThree.setSpeed(9);
        System.out.println("Модель: " + jaegerThree.getSpeed());
        jaegerThree.setStrength(8);
        System.out.println("Сила: " + jaegerThree.getStrength());
        jaegerThree.setArmor(6);
        System.out.println("Вооружение: " + jaegerThree.getArmor());
        jaegerTwo.fly(); jaegerTwo.shoot();jaegerTwo.swim();
    }
}

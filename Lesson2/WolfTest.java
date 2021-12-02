public class WolfTest {
    public static void main(String[] args) {
        Wolf oneWolf = new Wolf();
        oneWolf.setSex("Кобель");
        System.out.println("Пол: "  + oneWolf.getSex());
        oneWolf.setName("Диксон");
        System.out.println("Кличка: " + oneWolf.getName());
        oneWolf.setHeight(0.91f);
        System.out.println("Рост в холке: " + oneWolf.getHeight() + "м");
        oneWolf.setWeight(42.3f);
        System.out.println("Вес: " + oneWolf.getWeight() + "кг");
        oneWolf.setAge(11);
        System.out.println("Возраст: " + oneWolf.getAge() + " лет");

        // Вызов методов
        oneWolf.run();
        oneWolf.howl();
        oneWolf.hunt();
        oneWolf.go();
        oneWolf.sit();
    }
}
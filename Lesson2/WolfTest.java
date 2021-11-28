public class WolfTest {
    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.sex = "Кобель";
        System.out.println("Пол: "  + newWolf.sex);
        newWolf.name = "Север";
        System.out.println("Кличка: " + newWolf.name);
        newWolf.height = 0.80f;
        System.out.println("Рост в холке: " + newWolf.height + "м");
        newWolf.weight = 39.5f;
        System.out.println("Вес: " + newWolf.weight + "кг");
        newWolf.ageW = 9;
        System.out.println("Возраст: " + newWolf.age + " лет");

        // Вызов методов
        newWolf.run();
        newWolf.howl();
        newWolf.hunt();
        newWolf.go();
        newWolf.sit();
    }
}
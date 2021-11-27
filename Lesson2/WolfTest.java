public class WolfTest {
    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.sexWolf = "Кобель";
        System.out.println("Пол: "  + newWolf.sexWolf);
        newWolf.nameWolf = "Север";
        System.out.println("Кличка: " + newWolf.nameWolf);
        newWolf.heightWolf = 0.80f;
        System.out.println("Рост в холке: " + newWolf.heightWolf + "м");
        newWolf.weightWolf = 39.5f;
        System.out.println("Вес: " + newWolf.weightWolf + "кг");
        newWolf.ageWolf = 9;
        System.out.println("Возраст: " + newWolf.ageWolf + " лет");

        // Вызов методов
        newWolf.run();
        newWolf.howl();
        newWolf.hunt();
        newWolf.go();
        newWolf.sit();

    }
}
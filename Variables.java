public class Variables {
    public static void main(String[] args) {
        byte numCores = 4;
        System.out.println("Количество ядер процессора: " + numCores);
        char cpu = 'r';
        System.out.println("Модель процессора: " + cpu);
        boolean isCompWork = true;
        System.out.println(isCompWork);
        short cacheMemory = 64;
        System.out.println("Значение кэш-памяти: " + cacheMemory);
        long frequencyHz = 30000000000l;
        System.out.println("Приблизительная тактовая частота процессора: " + frequencyHz);
        int hddMBytes = 1000000;
        System.out.println("Объем памяти жёсткого диска: " + hddMBytes);
        float price = 86365.55f;
        System.out.println("Стоимость: " + price);
        double freqMemoryHz = 660000000;
        System.out.println("Частота оперативной памяти: " + freqMemoryHz);
    }
}

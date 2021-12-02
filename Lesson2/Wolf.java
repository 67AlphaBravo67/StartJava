 public class Wolf {

    // Геттер и Сеттер переменной name
    private String name; 
    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    // Сеттер и Геттер переменной sex
    private String sex;
    public String getSex() {
        return sex;
    } 

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Сеттер и Геттер переменной height
    private float height;
    public float getHeight() {
        return height;
    } 

    public void setHeight(float height) {
        this.height = height;
    }
    
    // Сеттер и Геттер переменной weight
    private float weight;
    public float getWeight() {
        return weight;
    } 

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Сеттер и Геттер переменной age
    private int age;
    public int getAge() {
        return age;
    } 

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void run() {
        System.out.println("Бегает");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    public void go() {
        System.out.println("Ходит");
    }
        
    public void sit() {
        System.out.println("Сидит");
    }
}


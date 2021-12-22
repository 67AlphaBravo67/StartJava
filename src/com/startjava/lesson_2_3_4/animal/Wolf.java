package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    // Геттер и Сеттер переменной name
    private String name; 
    private String sex;
    private float height;
    private float weight;
    private int age;
    
    public String getName() {
        return name;
    } 

    public String getSex() {
        return sex;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public void setSex(String sex) {
        this.sex = sex;
    } 

    public void setHeight(float height) {
        this.height = height;
    } 

    public void setWeight(float weight) {
        this.weight = weight;
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


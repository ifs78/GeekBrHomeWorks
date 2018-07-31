package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {
    protected String color;
    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void catInfo(){
        System.out.println("Cat: " + name + " " + color);
    }

    @Override
    void run(int dist) {
        if (dist < 100) System.out.println(name + " бежит " + dist + " метров");
    }

    @Override
    void jump() {
        System.out.println("Кот прыгает ");
    }
}

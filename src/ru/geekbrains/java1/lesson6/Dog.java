package ru.geekbrains.java1.lesson6;

public class Dog extends Animal{
      protected String color;
      public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void dogInfo(){
        System.out.println("Dog: " + name + " " + color);
    }

    @Override
     void run(int dist) {
         if (dist < 500) System.out.println("Собака бежит "+ dist + " метров");
    }

    @Override
    void swim(int dist) {
        if (dist < 10) System.out.println(name + " плывет " + dist +" метров");
         else System.out.println(name + " столько не плывет");

    }

    @Override
    void jump() {
        System.out.println("Собака прыгает ");
    }
}

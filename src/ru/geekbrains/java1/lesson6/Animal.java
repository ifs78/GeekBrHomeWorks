package ru.geekbrains.java1.lesson6;

public class Animal {
    protected String name;
    public Animal(){
            }
        public Animal(String name) {
            this.name = name;
        }
        public void animalInfo(){
            System.out.println("Animal: " + name);
        }
        void run(int dist){
            System.out.println("Животное бежит ");
        }
        void swim(int dist){
            System.out.println("Животное плывет ");
        }
        void jump(){
            System.out.println("Животное прыгает ");
        }
    }


package ru.geekbrains.java1.lesson6;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal");
	Cat cat = new Cat("Барсик ", "Белый");
	Dog dog = new Dog("Тузик" , "Черный");
	animal.animalInfo();
	cat.animalInfo();
	cat.catInfo();
	cat.run(50);
	cat.swim(2);
	dog.swim(8);
	}
}

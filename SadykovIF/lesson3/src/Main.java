package ru.geekbrains.java1.lesson3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int play = 1;
        while (play == 1) {
            inputDigit();
            System.out.println("Повторить игру? (1 - да, 0 - нет)");
            if (scan.hasNextInt()){
                play = scan.nextInt();
            } else System.out.println("Вводите 1 или 0");
            if (play == 0) break;
        }
    }

    private static void inputDigit() {
        int digit, rand, i;
        Random rnd = new Random();
        rand = rnd.nextInt(10);
        Scanner scan = new Scanner(System.in);
        i = 0;
        do {
            i++;
            System.out.println(i + " я попытка. Введите число от 0 до 9");
            digit = scan.nextInt();
            if (digit > rand) System.out.println("Ваша число больше загаданного");
            else if (digit < rand) System.out.println("Ваша число меньше загаданного");
            else if (digit == rand) {
                System.out.println("Угадали");

                break;
            }

        }
        while (i < 3);
        if (digit != rand) System.out.println("Не угадали!");


    }


}

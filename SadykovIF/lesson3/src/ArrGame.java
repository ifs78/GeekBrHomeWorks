package ru.geekbrains.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class ArrGame {

    public static void main(String[] args) {
        inputWord();
        }

        private static void inputWord() {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            String word;
            Random rnd = new Random();
            int i,j,k;
            i = rnd.nextInt(words.length);
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите слово");
            word = scan.next();
            System.out.println(word);
            boolean b = word.length()-words[i].length();
                
               if (word.equals(words[i])) System.out.println("Вы выйграли");
                else {
                  for (j = 0 ; j<word.length(); j++) {
                      System.out.print(words[i].charAt(j));
                     if (word.charAt(j) == words[i].charAt(j)) System.out.print(word.charAt(j));
                     //  else System.out.print("#");
                  }
                }

        }


}

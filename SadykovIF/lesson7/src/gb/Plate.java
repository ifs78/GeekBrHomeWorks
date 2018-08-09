package gb;

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n, String name) {
        boolean hunger;
        addFood(n);
       if (food-n>=0) {
            food -= n;
            hunger = true;
            System.out.println(name + " поел");
        }
        else {
           name = name.replaceAll("ка$","ки");
           name = name.replaceAll("к$","ка");
           hunger = false;
           System.out.println("Для " + name + " не достаточно еды в тарелке");
        }
            return hunger;
       }
    public void info() {
        System.out.println("Осталось еды: " + food);
    }
    private void addFood(int n){
        Scanner scan = new Scanner(System.in);
        if (food-n<=0) {
            System.out.println("Добавить 20 еды ? 1 - да, 0 - нет");
            int query = scan.nextInt();
            if (query == 1) food = food + n;
        }
    }


}


package gb;

public class Cat {
    private String name;
    private int appetite;
    private boolean b;
        public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
       public void eat(Plate p) {
            b = p.decreaseFood(appetite, name);
    }
    public void catInfo() {
        System.out.println("Кот " + name + ", Аппетит " + appetite + ", Сытость "+ b);
    }
}

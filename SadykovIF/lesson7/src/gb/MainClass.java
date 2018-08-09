package gb;
public class MainClass {
    private static Cat[] cat = new Cat[5];
    public static void main(String[] args) {
        cat[0] = new Cat("Барсик", 39);
        cat[1] = new Cat("Мурзик", 55);
        cat[2] = new Cat("Васька", 18);
        cat[3] = new Cat("Рыжик", 23);
        cat[4] = new Cat("Тишка", 19);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].catInfo();
        }

    }
}

package gb;


public class Main {

    public static void main(String[] args) {
        MyArr arr = new MyArr(20);
        MyArr arr_big = new MyArr(500);
        MyArr arr_s = arr_big;
        MyArr arr_i = arr_big;
        int value_d = 15;
        int value_in = 18;
        int value_search = 17;
        System.out.println("Создаем массив");
            arr.creat();
            arr.display();
        System.out.print("\n Удаляем элемент " + value_d);
            arr.delete(value_d);
            System.out.println();
            arr.display();
        System.out.print("\n Вставляем элемент " + value_in);
            arr.insert(value_in);
            System.out.println();
            arr.display();
        System.out.print("\n Поиск линейный " + value_search + "\n" + arr.find(value_search));
            arr.sortInsert();
        System.out.print("\n Поиск бинарный " + value_search + "\n" + arr.binaryFind(value_search));

        arr_big.creat();
            System.out.print("\n Сортировка пузырьком ");
            long start = System.currentTimeMillis();
                arr_big.sortBubble();
            long finish = System.currentTimeMillis();
            System.out.println();
        arr_big.display();
        System.out.println("\n Сортировка длилась " + (finish - start) + " мс");

        System.out.print("\n Сортировка выбором");
            start = System.currentTimeMillis();
            arr_s.sortSelect();
            finish = System.currentTimeMillis();
        System.out.println();
            arr_s.display();
        System.out.println("\n Сортировка длилась " + (finish - start) + " мс");

        System.out.print("\n Сортировка вcтавкой");
            start = System.currentTimeMillis();
            arr_i.sortInsert();
            finish = System.currentTimeMillis();
        System.out.println();
            arr_i.display();
        System.out.println("\n Сортировка длилась " + (finish - start) + " мс");


    }
}





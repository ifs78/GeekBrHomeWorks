package ru.geekbrains.java1.lesson1.dz1.SadykovIF;

public class HomeWork {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
     //  2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 922337203685477580L;
        float f = 3.4E+38f;
        double g = 1.7E+308;
        char ch = 'a';
        String str = "Is my string";
        boolean isTrue = true;

        System.out.println(calc(2,3,8,4));   // 3
        System.out.println(compare(5,8));                 // 4
        plusMin(0);                                    // 5
        negative(-8);                                  // 6
        name("Вася");
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    private static int calc(int a, int b, int c, int d) {
        a = a * (b + (c / d));
        return a;
    }
    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;

    private static boolean compare(int a, int b) {
        boolean isTrue;
        isTrue = a + b > 10 && a + b < 20;
        return isTrue;
    }
    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    private static String plusMin(int a) {
        String str;
        if (a > 0 || a == 0) {
            str = "Число положительное";
        } else str = "Число отрицательное";
            System.out.println(str);
            return str;
    }
    // 6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    private static boolean negative(int a) {
        boolean isTrue;
        isTrue = a < 0;
        System.out.println(isTrue);
        return isTrue;
    }
    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    private static void name(String str) {
        System.out.println("Привет, " + str);
    }
    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    
}


/*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
        Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get(). */

import java.util.ArrayList;
import java.util.HashMap;
    public class Phonebook {
        private static HashMap<String, ArrayList<String>> hm = new HashMap<>();
        public static void main(String[] args){
            add("Иванов","1-01");
            add("Петров","1-02");
            add("Сидоров","1-03");
            add("Иванов","1-04");
            add("Петров","1-05");
            add("Владимиров","1-06");
            add("Владимиров","1-07");


            System.out.println("Иванов " + get("Иванов"));
            System.out.println("Петров " + get("Петров"));

        }
        private static void add(String lastname, String tel){
            ArrayList<String> spr = hm.get(lastname);
            if (spr == null) spr = new ArrayList<>();
            spr.add(tel);
            hm.put(lastname,spr);
        }
        private static ArrayList<String> get(String lastname){
           return hm.get(lastname);

        }
    }


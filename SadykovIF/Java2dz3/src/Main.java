/* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив
   (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.*/
import java.util.*;
public class Main {
 public static void main(String[] args) {
     ArrayList<String> ar = new ArrayList<>();
     ar.add("улица");
     ar.add("фонарь");
     ar.add("аптека");
     ar.add("гараж");
     ar.add("ворота");
     ar.add("собака");
     ar.add("вечер");
     ar.add("ворота");
     ar.add("гараж");
     ar.add("фонарь");
     ar.add("река");
     ar.add("фонарь");
     ar.add("дерево");
     ar.add("гараж");
     ar.add("фонарь");
     ar.add("вечер");

     System.out.println("Полный список " + ar);

     HashMap<String, Integer> hm = new HashMap<>();

     for(String am : ar){
          if (!hm.containsKey(am)){
             hm.put(am, 0);
          }
             hm.put(am, hm.get(am)+1);
     }

     System.out.print("Уникальные ");
         for (String am : hm.keySet()){
            if (hm.get(am) == 1) System.out.print(am + " ");}
     System.out.println();
         for (String am : hm.keySet()){
            System.out.println(am + " " + hm.get(am));}
 }
}

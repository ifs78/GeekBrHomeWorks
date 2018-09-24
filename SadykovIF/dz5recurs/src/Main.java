import java.util.ArrayList;
import java.util.List;
public class Main {
    public static List<Subject> subjects;

    public static void main(String[] args) {
        addSubject();
        display();

    }
    private static void addSubject(){
        Subject book = new Subject("Книга",2,100);
        Subject nout = new Subject("Ноутбук",3,30000);
        Subject flashlight = new Subject("Фонарик",3,500);
        Subject ski = new Subject("Лыжи",10, 1000);
        Subject tent = new Subject("Палатка", 5,4000);
        subjects = new ArrayList<>();

        subjects.add(book);
        subjects.add(nout);
        subjects.add(flashlight);
        subjects.add(ski);
        subjects.add(tent);
    }
    private static void display(){
        Subject[] a = new Subject[subjects.size()];

            System.out.println(subjects);




    }
}
import java.util.ArrayList;

public class Uni {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Teacher("John", 42, 4));
        people.add(new Student("Farzon", 18, 2));
        people.add(new Teacher("Michael", 24, 2));
        people.add(new Student("Jahon", 19, 1));
        people.add(new Teacher("Andrey", 68, 5));
        people.add(new Student("HP", 1, 1));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
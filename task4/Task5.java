package softserve.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Danil", "Novitsky", 19));
        personList.add(new Person("Abdulap", "Philipov", 22));
        personList.add(new Person("Max", "Kaplutsky", 17));
        personList.add(new Person("Dima", "Zolotuhin", 29));
        personList.add(new Person("Lebron", "James", 37));

        System.out.println(personList.stream()
                .filter(p -> p.firstName.length() < 6).max(new PersonAgeComparator()));
    }
}
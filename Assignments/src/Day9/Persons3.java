package Day9;

import java.util.*;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class Persons3 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>(Comparator.comparingInt(Person::getAge));

        persons.add(new Person("John", 25));
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 22));

        System.out.println("Persons sorted by age:");
        persons.forEach(System.out::println);
    }
}


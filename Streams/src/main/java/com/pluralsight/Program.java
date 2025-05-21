package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Gürkan", "Çinar", 22));
        people.add(new Person("Hakan", "Saygi",44));
        people.add(new Person("Arslan", "Cabuk",54));
        people.add(new Person("Kamile", "Unlu",44));
        people.add(new Person("Loretta", "Harman",5));
        people.add(new Person("Nora", "Haley",3));
        people.add(new Person("Lindsey", "Carver",76));
        people.add(new Person("Suzanne", "Miller",23));
        people.add(new Person("Viktoriia", "Goodwin",12));
        people.add(new Person("Diamanto", "Athanasiadis",32));
        people.add(new Person("Tetyana", "Aslanidou",25));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine().trim();

        List<Person> matchedName = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) ||
                        person.getLastName().equalsIgnoreCase(searchName))
                .toList();

        System.out.println("People with the name \"" + searchName + "\":");
        matchedName.forEach(System.out::println);


        double averageAge = people.stream()
                .mapToDouble(Person::getAge).average().getAsDouble();

        System.out.printf("\n Average age is  %.2f" , averageAge);
        int maxAge = people.stream()
                .mapToInt(Person::getAge).max().orElse(0);

        System.out.println("\n Oldest age is equals to "+maxAge);

        int minAge = people.stream()
                .mapToInt(Person::getAge).min().orElse(0);
        System.out.println("\n Youngest age equals to "+ minAge);

scanner.close();


    }
}

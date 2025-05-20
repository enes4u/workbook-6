package com.pluralsight.collection;

import java.time.LocalDate;

public class CustomCollectionsTest {
    public static void main(String[] args) {
        // Testing with integers
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);

        try {
            numbers.add(43); // This should fail
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers List Size: " + numbers.getItems().size()); // Should print 3

        // Testing with LocalDate
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        try {
            dates.add(LocalDate.of(2025, 5, 20)); // This should fail
        } catch (IllegalStateException e) {
            System.out.println("This code is getting angry at me ;)) + Error: " + e.getMessage());
        }

        System.out.println("Dates List Size: " + dates.getItems().size()); // Should print 2
    }
}

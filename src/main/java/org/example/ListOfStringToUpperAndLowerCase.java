package org.example;

import java.util.List;

public class ListOfStringToUpperAndLowerCase {
    public static void main(String[] args) {
        List<String> names=List.of("ShresTHA","VIvek");
        names.stream().map(e->e.toLowerCase()).forEach(System.out::println);
        names.stream().map(e->e.toUpperCase()).forEach(System.out::println);
    }
}

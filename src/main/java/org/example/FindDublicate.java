package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDublicate {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,3,6,6,7);
        Set<Integer> list=numbers.stream().filter(i->Collections.frequency(numbers, i)>1).collect(Collectors.toSet());
        System.out.println(list);
    }
}

package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicateString {
    public static void main(String[] args) {
        List<String> names=List.of("s","f","s","j","f");
        List<String> list=names.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        Set<String> set=names.stream().distinct().collect(Collectors.toSet());
        System.out.println(set);
    }
}

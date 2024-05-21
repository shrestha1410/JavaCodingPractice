package org.example;

import java.util.List;

public class CountNumberOfStringStartWithSpecificLetter {
    public static void main(String[] args) {
        List<String> names=List.of("asff","sfsdsg","asdfsdf","vxcvxz");
       System.out.println(names.stream().filter(e->e.startsWith("a")).count());
    }
}

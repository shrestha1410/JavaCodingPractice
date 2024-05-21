package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {
        //empty stream

        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(t -> System.out.println(t));

        //using of
        String names[]={"Shrestha","Durgesh"};
        Stream<String> nameStream=Stream.of(names);
        nameStream.forEach(t ->System.out.println(t) );

        //Stream builder
        Stream<Object> builder=Stream.builder().build();
        builder.forEach(t -> System.out.println(t));

        // using Arrays
        IntStream arraysStream=Arrays.stream(new int[]{2,3,67,84});
        arraysStream.forEach(t-> System.out.println(t) );

    }
    
}

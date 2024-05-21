package org.example;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsOccurance {
    public static void main(String[] args) {
        String sentence="what we think we     become";
        String[] words=sentence.trim().replaceAll("\\s{2,}", " ").split(" ");
        System.out.println(Arrays.asList(words).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}

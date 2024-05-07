package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Write a program to check if the word 'orange' is present in the "This is orange juice".
 */
public class Question2 {
    public static void main(String[] args){
        String s="This is orange juice.";
        String target="orange";
        Boolean isFound= Arrays.stream(s.split(" ")).anyMatch(a-> a.equalsIgnoreCase(target));
        System.out.println(isFound);
    
    }
    
}

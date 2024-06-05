package org.example;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Integer[] intArrary= new Integer[]{3,9,5,2,6};
        //default
         Arrays.asList(intArrary).stream().sorted().forEach(System.out::println );
         Arrays.asList(intArrary).stream()
         .sorted((arg0, arg1) ->arg1.compareTo(arg0)).forEach(System.out::println );
         
    }
}

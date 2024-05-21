package org.example;

import java.util.List;

public class SumOfAllEven {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,5);
        Integer even=numbers.stream().filter(e -> e%2==0).reduce((a,b)->a+b).get();
        Integer odd=numbers.stream().filter(e -> e%2!=0).reduce((a,b)->a+b).get();
        System.out.println("Odd= "+odd);
        System.out.println("Even= "+even);
    }
}

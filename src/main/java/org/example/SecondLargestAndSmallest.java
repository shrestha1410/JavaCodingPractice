package org.example;

import java.util.List;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
      List<Integer> numbers=  List.of(1,2,3,4,5,6,7);
      Integer small=numbers.stream().distinct().sorted().skip(1).findFirst().get();
      Integer large=numbers.stream().distinct().sorted((arg0, arg1) -> arg1.compareTo(arg0)).skip(1).findFirst().get();
      System.out.println("Second Largest= "+large);
      System.out.println("Second Smallest= "+small);
    }
}

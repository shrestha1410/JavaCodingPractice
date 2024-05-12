package org.example;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Write a function to check if two strings are anagrams of each other.
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2= sc.nextLine();
      Map<Character,Long> forS1=  s1.chars().mapToObj(c->(char) c).filter(Character::isLetter).collect(Collectors.groupingBy(c->c,Collectors.counting()));
      Map<Character,Long> forS2=  s2.chars().mapToObj(c->(char) c).filter(Character::isLetter).collect(Collectors.groupingBy(c->c,Collectors.counting()));
      System.out.println(forS1.equals(forS2));
    }
    
}

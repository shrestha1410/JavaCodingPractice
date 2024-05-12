package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Input a string of alphabets. 
 * Find out the number of occurrence of all alphabets in that string. 
 * Find out the alphabet with maximum occurrence.
 */
public class Question7 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     String s=sc.nextLine();
     Map<Character, Long> occurrences = s.chars()
     .mapToObj(c -> (char) c)
     .filter(Character::isLetter)
     .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(occurrences);
     occurrences.forEach((arg0, arg1) -> System.out.println(arg0+" "+arg1));
     char maxOccurrenceChar = occurrences.entrySet().stream()
     .max(Map.Entry.comparingByValue())
     .map(Map.Entry::getKey)
     .orElseThrow();
     System.out.println(maxOccurrenceChar);
    }
    
}

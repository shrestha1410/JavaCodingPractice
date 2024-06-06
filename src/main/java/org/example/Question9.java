package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this

    // you code will be inside this main method
    // to view the output, just print the string
    
   
      Map<Character,Long> frequesncy=inputLine.chars().mapToObj(c->(char)c)
     .collect(Collectors.groupingBy(c->c,Collectors.counting()));
     System.out.println(frequesncy.entrySet().stream().filter(c->c.getValue()==1)
     .map(c->c.getKey()).findFirst().orElseThrow(() -> new RuntimeException("No non-repeating character found")));
    // below is a sample program output
    // System.out.print(inputLine);
    }
}
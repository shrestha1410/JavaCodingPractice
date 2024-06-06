package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question10 {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine();
    Set<Character> alphabet= new HashSet<>();
    for(char c='a';c<'z';c++){
        alphabet.add(c);
    }
    for(char c:inputLine.toLowerCase().toCharArray()){
        alphabet.remove(c);
    }
    Boolean value= alphabet.isEmpty()? true:false;

   System.out.println(value);
    }
}

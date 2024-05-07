package org.example;

/**
 * Write a program to check if the letter 'e' is present in the word 'Umbrella'. using stream
 */

public class StringQuestion1 {
 public static void main(String[] args){
    String s="Umbrella";
    System.out.println(s.chars().anyMatch(c ->c=='e' ));

 }
    
}

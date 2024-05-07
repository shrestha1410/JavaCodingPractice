package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Write a program that takes your full name as input and displays 
 * the abbreviations of the first and middle names except the last name 
 * which is displayed as it is. For example, if your name is Robert 
 * Brett Roser, then the output should be R.B.Roser.
 */
public class Question4 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String fullName=sc.nextLine();
    String abbrebation= 
    Arrays.stream(fullName.split(" ")).limit(fullName.split(" ").length-1)
   .map( t -> t.substring(0, 1).toUpperCase()+".").collect(Collectors.joining())
   +fullName.split(" ")[fullName.split(" ").length-1];
   System.out.println(abbrebation);
}
    
}

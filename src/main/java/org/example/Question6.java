package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Write a program to delete all consonents 
 * from the string "Hello, have a good day".
 */
public class Question6 {
    public static void main(String[] args){
        String s="Hello, have a good day";
        String str=s.chars().filter(value ->"aeiouAEIOU".indexOf(value)==-1)
        .mapToObj(value ->String.valueOf((char)value) )
        .collect(Collectors.joining());
        System.out.println(str);
    }
    
}

package org.example;

import java.util.Arrays;

/*
 * Write a program to find the number of vowels, consonents,
 *  digits and white space characters in a string.
 */
public class Question5 {
    public static void main(String[] args){
    String s="qwqrqererenghkhky234124fgfdsgd,14  fwti";
    long vowel= s.chars().filter(value ->"aeiouAEIOU".indexOf(value)!=-1).count();
    long consonant= s.chars().filter(value ->"aeiouAEIOU".indexOf(value)==-1).count();
    long space=s.chars().filter(value ->Character.isWhitespace(value)).count();
    long digit=s.chars().filter(value ->Character.isDigit(value)).count();
    System.out.println(vowel+" "+consonant+" "+space+" "+digit);
    }
    
}

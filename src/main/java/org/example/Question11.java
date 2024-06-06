package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Take the input line from argument and divide into array of 
strings based on :: delimiter, which will contain 2 elements: 
the first element will be a sequence of characters, and the second 
element will be a long string of comma-separated words, 
in alphabetical order, that represents a dictionary of some arbitrary 
length. For example: str can be:
"hellocat::apple,bat,cat,goodbye,hello,yellow,why".
 Your goal is to determine if the first element in the input can be 
 split into two words, where both words exist in the dictionary that 
 is provided in the second input. In this example, the first element can be 
 split into two words: hello and cat because both of those words are in the 
 dictionary.

Your program should return the two words that exist in the dictionary 
separated by a comma. So for the example above, your program should 
return hello,cat. There will only be one correct way to split the 
first element of characters into two words. If there is no way to 
split string into two words that exist in the dictionary, return the 
string not possible. The first element itself will never exist in the
 dictionary as a real word.
Examples
Input: "baseball::a,all,b,ball,bas,base,cat,code,d,e,quit,z"
Output: base,ball

Input: "abcgefd::a,ab,abc,abcg,b,c,dog,e,efd,zzzz"
Output: abcg,efd */
public class Question11 {
    public static void main(String[] args) {
        String str="baseball::a,all,b,ball,bas,base,cat,code,d,e,quit,z";
        String[] specateStringArray=str.split("::");
        String word=specateStringArray[0];
        String[] dictionary=specateStringArray[1].split(",");
        Set<String> dictionarySet= new HashSet<>();
        for(int i=0;i<dictionary.length;i++){
         dictionarySet.add(dictionary[i]);
        }
        for(int i=0;i<word.length();i++){
        String first= word.substring(0,i);
        String second=word.substring(i,word.length());
         if(dictionarySet.contains(first) && dictionarySet.contains(second)){
           System.out.println(first+","+second);
         }
    }
}
}

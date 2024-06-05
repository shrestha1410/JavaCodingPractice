package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
        Integer[] array= new Integer[]{9,5,2,6,0,2,56,13,66,896,21,6,31};
        //max element
         Arrays.asList(array).stream()
        .max(Comparator.naturalOrder()).ifPresent(System.out::println);
        // sum of Elements
        Arrays.asList(array).stream().reduce((a,b)->a+b).ifPresent(System.out::println);
        //reverse the array
        Collections.reverse(Arrays.asList(array));
        Arrays.asList(array).forEach(a->System.out.print(a+" "));
        System.out.println("\n");
        //count specific element
        Long count=Arrays.asList(array).stream().filter(a->a==6).count();
        System.out.println(count+"\n");
        // retate the array wirh position 4
        // Arrays.asList(array).stream().map(a->a)
        int b=array.length-1;
        int size=(array.length-4)/2;
        for(Integer a=4;a<size;a++){
            if(a>4){
             int temp=array[a];
             array[a]=array[b];
             array[b]=temp;
             b--;
            }
        }

        Arrays.asList(array).forEach(a->System.out.print(a+" "));
    
    }
}

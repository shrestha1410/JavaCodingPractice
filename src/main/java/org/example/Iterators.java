package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list1= List.of(2,4,50,21,22,67);
        List<Integer> evenList=new ArrayList<>();
        ListIterator listitr= list1.listIterator();
        while (listitr.hasNext()) {
            Integer value=(Integer) listitr.next();
            if(value%2==0){
                evenList.add(value);
            }
        }
        System.out.println(evenList);
    }
    
}

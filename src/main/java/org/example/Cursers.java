package org.example;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Cursers {
    public static void main(String[] args) {
        /*
         * it is only use in lregacy clases like vectoer stack queue.it is a forward direction 
         * cursor.
         */
        Vector<Integer> vector= new Vector<>();
        vector.add(13);
        vector.add(98);
        vector.add(2);
        Enumeration enumeration= vector.elements();
        while(enumeration.hasMoreElements()){
         System.out.println(enumeration.nextElement());
        }
        /*
         * it is used for all type of collection  but it is also uni directional
         */
        List<String> list= new ArrayList<>();
        list.add("Shrestha");
        list.add("krishna");
        list.add("Radha");

        Iterator<String> itr= list.iterator();
        while(itr.hasNext()) {
         System.out.println(itr.next());            
        }
        /*
         * it is  bidirectional cusrsor  but only works in list
         */
        List<String> list2= new ArrayList<>();
        list2.add("Shrestha");
        list2.add("krishna");
        list2.add("Radha");
        ListIterator<String> listItr= list2.listIterator();
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }
        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }
       }
}

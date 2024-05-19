package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(56);
        list.add(31);
        list.add(8);
        list.add(90);
        Collections.sort(list);
        System.out.println(list);

        // for employee comparable
        // use for default sorting but not work for string buffer gives classCastException
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Shrestha",13,"java"));
        empList.add(new Employee("Duragesh",93,"java"));
        empList.add(new Employee("Pankaj",34,"java"));
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);

        // for employee comparator
         // use for customized sorting.
        ArrayList<Employee> empList1=new ArrayList<>();
        empList1.add(new Employee("Shrestha",13,"java"));
        empList1.add(new Employee("Duragesh",93,"java"));
        empList1.add(new Employee("Pankaj",34,"java"));
        System.out.println(empList1);
        Collections.sort(empList1,new NameComparator());
        System.out.println(empList1);

        
    }
    
}

package org.example;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer id;
    private String  department;

    public String name(){
        return this.name;
    }
    public Integer id(){
        return this.id;
    }
    public String department(){
        return this.department;
    }
    public Employee(String name,Integer id,String department){
        this.name= name;
        this.id=id;
        this.department=department;
    }
    @Override
    public int compareTo(Employee o) {
      return this.id-o.id;
    }
    @Override
    public String toString(){
   return "Employee{ name=" +name +", id="+id+".department="+department+"}";

    }

}

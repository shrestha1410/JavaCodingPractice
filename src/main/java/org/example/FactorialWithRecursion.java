package org.example;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        int factorial=fact(5);
        System.out.println(factorial);
    }
    public static int fact(int n){
    if(n==0){
       return 1;
     }else{
       return n*fact(n-1);
     }
    }
}

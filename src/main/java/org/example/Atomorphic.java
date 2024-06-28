package org.example;

import java.util.Scanner;

public class Atomorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int squre=n*n;
        int temp=squre;
        int atom=0;
        int r=0;
        System.out.println(squre);
        int i=0;
       while(i>2){
         r=temp%10;
         atom=atom*i*10+r;
         temp=temp/10;
         i++;
        }
        System.out.println(atom);
        if(atom== n)
         System.out.println("Atomorphic");
         else
         System.out.println("Not Atpmorphic");
    }
}

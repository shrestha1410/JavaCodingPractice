package org.example;

import java.util.Scanner;

public class PrimeNumner {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            prime(i);
        }
    }
    public static void prime(int n){
        int flag=0;
        if(n==0||n==1){
            flag=1;
        }else{
        for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
            flag=1;
         }
        }
        if(flag==0){
            System.out.print(n+" ");
        }
    }
}
    }

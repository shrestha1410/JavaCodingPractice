package org.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int pow=0;
        while(temp>0){
            temp=temp/10;
            pow++;
        }
        int sum=0;
         temp=n;
         int r=0;
         while (temp>0) {
            r=temp%10;
            sum+=Math.pow(r, pow);
            temp=temp/10;
         }
         if(sum==n)
         System.out.println("Armstrong");
         else
         System.out.println(" Not Armstrong");
    }
}

package org.example;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int random=(int)Math.random()*(start+end-1)+start;
        System.out.println(random);
    }
}

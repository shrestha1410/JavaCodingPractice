package org.example;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n = n / 10;
        }
        if (rev == original) {
            System.out.println("Palindrone");
        } else {
            System.out.println("Not Palindrone");
        }
    }
}

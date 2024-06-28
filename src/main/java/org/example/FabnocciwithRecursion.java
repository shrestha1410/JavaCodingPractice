package org.example;

public class FabnocciwithRecursion {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void main(String[] args) {
        int count = 10;

        System.out.print(n1 + " " + n2);
        fab(count - 2);
    }

    public static void fab(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fab(count - 1);
        }
    }
}

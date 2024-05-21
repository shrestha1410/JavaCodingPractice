package org.example;

import java.util.List;

public class MinMaxInteger {
    public static void main(String[] args) {
        List<Integer> integer= List.of(2134,6456,231,99,11222,767);
        Integer max=integer.stream().max((arg0, arg1) ->arg0.compareTo(arg1)).get();
        Integer min=integer.stream().min((arg0, arg1) ->arg0.compareTo(arg1)).get();
        System.out.println("Max="+ max +"\n Min ="+ min);
    }
}

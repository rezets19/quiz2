package com.company;

/**
 * Created by rezets on 10.02.2016.
 */
public class Quiz17 {

    public static void method(int ... v) {
        System.out.println("int");
        for(int n : v)
            System.out.println(n);
    }

    public static void method(boolean ... v) {
        System.out.println("bool");
        for(boolean n : v)
            System.out.println(n);
    }
}

package com.company;

/**
 * Created by rezec on 11.02.2016..
 */
public class Quiz26 {

    private int x = 10;

    public int y = 11;

    public static int z = 12;

    public static void main(String[] args) {

        int x = 11;
        int y = 12;
        int z = 13;
        new Quiz26().new Initialize().init();

    }

    class Initialize{
        void init() {
            System.out.println(x + " " + y + " " +z);
        }
    }
}

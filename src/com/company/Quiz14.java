package com.company;

/**
 * In for-each loop, the iteration variable is read-only
 */
public class Quiz14 {

    public static void forEachTest() {
        int[] arr = {1,2,3};

        for(int e : arr) {
            System.out.print(e);
            e = e +5;
        }
        for(int e : arr) {
            System.out.print(e);
        }
    }
}

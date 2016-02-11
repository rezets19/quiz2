package com.company;

/**
 *
 */
public class Quiz24 {
    private static int increment(int i){
        int num = (++i) + (i++);
        return num;
    }

    public static void main(String[] args) {
        for(int i=0; i < 5; i = increment(i)){
            System.out.print(i);
        }
    }

    /**
     * wrong
     */
    public static void main() {
        for(int i=0; i < 5; increment(i)){
            System.out.print(i);
        }
    }
}

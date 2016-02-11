package com.company;

/**
 *
 */
public class SubClass {

    private SubClass(){
        System.out.print("sub ");
    }

    public static void main(String[] args) {
        new SuperClass();
        class InnerClass{

            private InnerClass() {System.out.print("inner ");}
            {new SubClass();}
            {new SuperClass();}
        }
        new InnerClass();
    }
}

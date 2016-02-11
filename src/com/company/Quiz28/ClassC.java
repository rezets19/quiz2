package com.company.Quiz28;

/**
 * The polymorphic invocations of the hello() method use the version that corresponds to the object type and not the reference variable type.
 */
public class ClassC extends ClassB {

    @Override
    String hello() {
        return "C";
    }

    //@Override
    Integer hello(int i) {
        //"Different signature";
        return i;
    }

    public static void main(String[] args) {

        ClassA[] msgs = new ClassA[3];

        msgs[0] = new ClassB();
        msgs[1] = (ClassA) new ClassC();
        ClassB b = new ClassB();
        msgs[2] = (ClassA) b;

        ClassC aa = new ClassC();
        System.out.println(aa.hello(11));

        //java.lang.ClassCastException
        //System.out.println(((ClassC)b).hello(22));

        ClassC o = new ClassC();
        System.out.println(((Object) o));

        for(ClassA a:msgs)
            System.out.print(a.hello());
    }
}

package com.company.Quiz28;

/**
 * The polymorphic invocations of the hello() method use the version that corresponds to the object type and not the reference variable type.
 */
public class ClassC extends ClassB {

    @Override
    String hello() {
        return "C";
    }

    public static void main(String[] args) {

        ClassA[] msgs = new ClassA[3];

        msgs[0] = new ClassB();
        msgs[1] = (ClassA) new ClassC();
        ClassB b = new ClassB();
        msgs[2] = (ClassA) b;

        ClassA aa = new ClassB();
        System.out.println(aa.hello());

        for(ClassA a:msgs)
            System.out.print(a.hello());
    }
}

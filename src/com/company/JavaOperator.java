package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class JavaOperator
{

    static void printXY()
    {
        Integer x = 0;
        Integer y = 0;
        Short z = 0;
        for(z = 0; z < 5; z++) {
            if((++x > 3) || (++y > 3)) {
                x++;
            }
        }

        System.out.println(x + "; " + y + "; " + z + "; ");
    }

    static void printSuccess()
    {
        boolean b1 = true, b2 = false;

        if((b1 = false) | (b1 ^ b2)) {
            System.out.println("success");
        }
    }

    static void printFinally()
    {
        try {
            System.out.println("1");
            System.exit(0);
            System.out.println("2");
        } finally {
            System.out.println("3");
        }
    }

    static void printSizeHashSet()
    {
        Set<Short> set = new HashSet<Short>();
        for(short i = 0; i < 10; i++) {
            set.add(i);
            set.remove(i-1);
        }

        System.out.println(set.size());
    }

    static void printLabmda()
    {
        String name = "Java";
        Runnable r1 = () -> System.out.println(name);

        String name1 = "";
        //name1 = name.toUpperCase();
        Runnable r2 = () -> System.out.println(name1);

        r1.run();
    }

    static void testCharacter()
    {
        System.out.println("H" + 'I');
        System.out.println('H' + 'I');
    }

    /**
     * Problema v "<=", net znachenija bolshe chem Integer.MAX_VALUE, i posle MAX_VALUE poidet MIN_VALUE
     */
    static void loopingIntegers()
    {
        Integer start = Integer.MAX_VALUE - 2;
        Integer end = Integer.MAX_VALUE;

        Integer count = 0;


        System.out.println(start);
        System.out.println(end);

        for(Integer i = start; i <= end; i++) {
            count++;
            System.out.println(i);
            if(i < 0) {
                break;
            }
        }

        System.out.println(count);
    }

    static void quiz20() {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1 == s2);
    }

    public static void quiz22() {
        System.out.println(new Boolean("true"));
        System.out.println(Boolean.valueOf("1"));
        System.out.println(Boolean.valueOf(null));
    }
}

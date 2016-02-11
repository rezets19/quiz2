package com.company;

/**
 *
 */
public class Quizz11
{
    public static String getValue(Integer value)
    {
        return "integer";
    }

    public static String getValue(Object value)
    {
        return "object";
    }

    public static void test()
    {
        System.out.println(getValue(null));
    }

}

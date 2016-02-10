package com.company;

/**
 * Created by rezec on 10.02.2016..
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

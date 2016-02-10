package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by rezec on 09.02.2016..
 */
public class Name
{
    private final String siteName;

    public Name(String name)
    {
        siteName = name;
    }

    public boolean equals(Object o)
    {
        if(!(o instanceof Name)) {
            return false;
        }

        Name n = (Name) o;
        return n.siteName.equals(siteName);
    }

    public int hashCode()
    {
        return Objects.hashCode(siteName);
    }

    static void testEquals()
    {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Java"));
        System.out.println(new Name("Java").hashCode());

        for( Name entry : s ){
            System.out.println( s.hashCode() );
        }

        System.out.println(s.contains(new Name("Java")));
    }
}

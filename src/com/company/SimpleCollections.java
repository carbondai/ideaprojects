package com.company;

import java.util.*;

/**
 * Created by ht706 on 18-3-16.
 */
public class SimpleCollections {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add("abc");
        int[] a = {1,2,3};
        c.add(a);
        for(Object o:c)
            System.out.println(o);
    }
}

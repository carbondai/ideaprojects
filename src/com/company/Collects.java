package com.company;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by ht706 on 18-1-31.
 */
public class Collects {
    public static void main(String[] args) {
        Vector vector = new Vector();
        int i = vector.capacity();
        System.out.println(i);
        for(i = 0; i < 11; i++) {
            vector.add("a");
        }
        i = vector.capacity();
        System.out.println(i);
        ArrayList arrayList = new ArrayList();
        //arrayList.ensureCapacity(20);
        arrayList.add("a");
        System.out.println(arrayList.size());
        Object[] a = {};
        System.out.println(a.length);

        Object[] b = new Object[10];
        System.out.println(b.length);

    }
}

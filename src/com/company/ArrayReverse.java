package com.company;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Observer;

/**
 * Created by ht706 on 18-2-9.
 */
public class ArrayReverse {
    private static void swap(ArrayList a, int i, int j) {
        a.set(j, a.set(i, a.get(j)));
    }
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayReverse ar = new ArrayReverse();
        a.add("hello");
        a.add(10);
        a.add(ar);
        a.add(15);
        System.out.print(a);
        for(int i = 0; i < a.size()/2; i++) {
            swap(a, i, a.size()-1-i);
        }
        System.out.print(a);
    }
}




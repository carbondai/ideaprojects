package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ht706 on 18-1-22.
 */
public class BubbleSort {
    private static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int[] bubbleSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = 0; j < a.length - i; j++) {
                if(a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
        return a;

    }
    public static int[] bubbleSort2(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i; j < a.length; j++) {
                if(a[j] > a[i]) {
                    swap(a, i, j);
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {99, 3, 354, 42, 33, 146, 31, 0, 95, 109};
        int[] b = bubbleSort(a);
        for(int bs:b) {
            System.out.print(bs + " ");
        }
        System.out.println();
        int[] c = bubbleSort2(a);
        for(int cs:c) {
            System.out.print(cs + " ");
        }
    }
}


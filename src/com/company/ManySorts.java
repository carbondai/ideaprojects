package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ht706 on 18-3-20.
 */
public class ManySorts {
    public static int[] insertSort(int[] a) {
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            for(;j>=0;){
                if(a[j] > key){
                    a[j+1] = a[j];
                    j--;
                }else {
                    break;
                }
            }
            a[j+1] =key;
        }
        return a;

    }
    public static int[] binaryInsertSort(int[] a) {
        for(int i =1; i< a.length; i++) {
            int key = a[i];
            int low = 0;
            int high = i-1;
            int mid;
            int j = i-1;
            while(low<=high){
                mid = (low+high)/2;
                if(a[mid] <= key)
                    low = mid + 1;
                else
                    high = mid -1;
            }
            mid = low;
            for(; j>=mid; j--){
                a[j+1] = a[j];
            }
            a[j+1] = key;
        }
        return a;
    }
    public static int[] quickSort(int[] a, int start, int end) {
        if(start>=end)
            return a;
        int pos = divide(a, start, end);
        quickSort(a, start , pos -1);
        quickSort(a, pos+1, end);
        return a;

    }
    static int divide(int[] a, int start, int end) {
        int base = a[end];
        while (start < end) {
            while(start < end && a[start] <= base) {
                start++;
            }
            if(start<end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
            }
            while(start < end && a[end] >= base) {
                end--;
            }
            if(start<end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
            }

        }
        return end;
    }

    public static void main(String[] args) {
        int n = 100000;
        final int[] a = new int[n];
        Random r = new Random(47);
        for(int i=0; i<n; i++) {
            a[i] = r.nextInt(n);
        }
        long start = System.currentTimeMillis();
        //quickSort(a, 0, a.length-1);
        //insertSort(a);
        binaryInsertSort(a);
        //BubbleSort.bubbleSort3(a);
        long end = System.currentTimeMillis();
        System.out.print("time: "+(end-start));

        //System.out.print(Arrays.toString(a));
    }
}

package com.company;

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

    public static void main(String[] args) {
        final int[] a = new int[30];
        Random r = new Random(47);
        for(int i=0; i<30; i++) {
            a[i] = r.nextInt(100);
        }
        binaryInsertSort(a);

        System.out.print(Arrays.toString(a));
    }
}

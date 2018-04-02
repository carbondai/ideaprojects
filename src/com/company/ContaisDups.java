package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ht706 on 18-3-28.
 */
public class ContaisDups {
    public static boolean containDups(int[] a) {
        if(a == null || a.length == 0) {
            return false;
        }
        Set set = new HashSet();
        for(int i=0;i<a.length;i++) {
            if(!set.add(a[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={1,1};
        System.out.println(containDups(a));
        System.out.println(containDups(b));

    }
}

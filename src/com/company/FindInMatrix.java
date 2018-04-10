package com.company;

import static com.company.BubbleSort.swap;

/**
 * Created by ht706 on 18-4-3.
 */
public class FindInMatrix{
    public static boolean findInMatix(int[][] a, int key) {
        if(a == null || a.length==0){
            return false;
        }
        int rows = a.length;
        int lines = a[0].length;
        for(int row = 0, line = lines-1; (row < rows)&&(line>=0); ) {
            if(key == a[row][line]){
                return true;
            } else if(key<a[row][line]){
                line--;
            } else {
                row++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{}};
        System.out.println(findInMatix(arr, 5));
        String s = "abcd";
        char[] cs = s.toCharArray();
        System.out.println(cs.length);
    }
}

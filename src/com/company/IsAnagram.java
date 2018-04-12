package com.company;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by ht706 on 18-4-12.
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] counts = new int[26];
        int[] countt = new int[26];
        for(int i=0;i<s.length();i++) {
            counts[s.charAt(i)-'a']++;
            countt[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(counts, countt))
            return true;
        else
            return false;
    }

    /**
     * leetcode上有一种只需要一个额外数组的解法
     * @param args
     */
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] cs = new int[26];
        for(int i=0; i<s.length(); i++) {
            cs[s.charAt(i) - 'a']++;
            cs[t.charAt(i) - 'a']--;
        }
        for(int c:cs){
            if(c != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        String t = "bcdeafg";
        System.out.print(isAnagram(s, t));
    }
}

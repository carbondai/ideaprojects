package com.company;

import java.util.HashMap;

/**
 * Created by ht706 on 18-4-10.
 */
public class Palindrome {
    public static int reverseInt(int x) {
        return 1;
    }
    public static boolean isPalindrome(String s) {
        String s2 = s.replaceAll("\\W", "");
        char[] cs = s2.toLowerCase().toCharArray();
        for(int i=0; i<cs.length/2; i++) {
            if(cs[i] != cs[cs.length-1-i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
}

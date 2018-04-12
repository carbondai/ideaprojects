package com.company;


/**
 * Created by ht706 on 18-4-12.
 */
public class ReverseInt {
    public static int reverseInt(int x) {
        String s = String.valueOf(x);
        char[] cs = s.toCharArray();
        int result = 0;
        int i = cs.length-1;
        if(cs[0] != '-') {
            while(i>=0 && result < Integer.MAX_VALUE) {
                result += (cs[i]-'0')*Math.pow(10, i);
                i--;
            }
            if(result < Integer.MAX_VALUE) {
                return result;
            }else {
                return 0;
            }
        } else {
            while(i>0 && result>Integer.MIN_VALUE) {
                result -= (cs[i]-'0')*Math.pow(10, i-1);
                i--;
            }
            if(result > Integer.MIN_VALUE) {
                return result;
            }else {
                return 0;
            }
        }
    }

    /**
     * leetcode上的牛逼解法
     * @param
     */
    public static int reverseInt2(int x) {
        int res = 0;
        while(x!=0) {
            int temp = res * 10 + x % 10;
            x /= 10;
            if(temp / 10 != res) { //判断temp是否溢出
                res = 0;
                break;
            }
            res = temp;
        }
        return res;
    }
    public static void main(String[] args) {
        int i = 2147483647;
        System.out.print(reverseInt(i));
    }
}

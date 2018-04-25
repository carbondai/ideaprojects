package com.company;

/**
 * Created by ht706 on 18-4-19.
 */
public class Fibonacci {
    public static long fibonacci(int n) {
        long f0 = 0, f1 = 1;
        long fn = 0;
        for(int i=2; i<=n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
    public static int numberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(numberOf1(-1));
    }
}

package com.company;

import java.sql.Time;

/**
 * Created by ht706 on 18-2-6.
 */
public class StringConnect {
    public static void main(String[] args) {
        int n = 100000;
        String result = "";
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            result += "hello".intern();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            sb.append("hello");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

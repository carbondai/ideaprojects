package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ht706 on 18-2-5.
 */
public class StringMatch {
    public static void main(String[] args){
        String s = "abcdeeeef";
        String[] chars = s.split("");
        for(String ch : chars) {
            System.out.print(ch + " ");
        }
        Pattern p = Pattern.compile("ee");
        Matcher m = p.matcher(s);
        int count = 0;
        while(m.find()) {
            count++;
        }
        System.out.print(count);
    }
}

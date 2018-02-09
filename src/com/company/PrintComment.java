package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ht706 on 18-2-7.
 */
public class PrintComment {
    public static void main(String[] args) throws Exception {
        String regex1 = "/\\*[^*/]+\\*/|//[^\n]+\n";
        //String regex1 = "//([^\n]+\n)";
        File file = new File(args[0]);
        Scanner s = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while(s.hasNextLine()) {
            sb.append(s.nextLine());
            sb.append("\n");
        }
        Pattern p = Pattern.compile(regex1, Pattern.DOTALL);
        Matcher m = p.matcher(sb);
        while(m.find()){
            for(int i=0; i<m.groupCount(); i++) {
                System.out.println(m.group(i));
            }
        }
    }
}

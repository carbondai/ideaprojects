package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ht706 on 18-2-5.
 */
public class MoveFiles {
    public static FilenameFilter filter(String s) {
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(s);
            }
        };

    }
    public static void main(String[] args) throws Exception{
        File file = new File("./src/com/company");
        File[] files = file.listFiles(filter("java"));
        for(File f : files) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String fn = f.getName();
            FileWriter fw = new FileWriter(fn.substring(0,fn.lastIndexOf(".")) + ".jad");
            BufferedWriter bw = new BufferedWriter(fw);
            String r = null;
            while((r = br.readLine()) != null){
                bw.write(r);
                bw.newLine();
            }
            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
    }
}

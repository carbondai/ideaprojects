package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Timestamp;
import java.util.*;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.identityHashCode;

class Gerbil {
    private int gerbilNum;
    Gerbil() {
       System.out.print("gernil");
    }
    Gerbil(int i) {
        gerbilNum = i;
    }
    void hop() {
        System.out.println("Number " + gerbilNum + "is hopping");
    }
    public String toString() {
       return "I am number " + gerbilNum;
    }
}

class Animal extends Gerbil {
    private int i;
    Animal() {
        System.out.println("yes or no");
    }
    public  Animal(int i) {
        this.i = i;
    }
    public void eat() {
        System.out.println("eat ");
    }
}

class Solution {
    public List anagramMapping(int[] A, int[] B) {
        HashMap hashMap = new HashMap();
        List list = new LinkedList();
        for(int i = 0; i < B.length; i++) {
            hashMap.put(B[i], i);
        }
        for(int i = 0; i < A.length; i++) {
            list.add(hashMap.get(A[i]));
        }
        return list;
    }
    public void temp() throws IOException{
        String desc = "http://blog.csdn.net/u012877472/article/details/50852933";
        URL url = new URL(desc);

        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        File dest = new File("./test.html");
        FileOutputStream fos = new FileOutputStream(dest);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");

        BufferedReader br = new BufferedReader(isr);
        String data;

        while((data = br.readLine())!= null) {
            osw.write(data);
        }
        osw.close();
        fos.close();
        br.close();
        isr.close();
        is.close();
    }
}

public class Main {

    public static void main(String[] args ) throws IOException{
        // write your code here
        File file = new File("test.html");
        Document doc = Jsoup.parse(file, "utf-8");
        Elements datas = doc.getElementsByTag("p");
        for (Element data : datas) {
            System.out.println(data.text());

        }


    }
}



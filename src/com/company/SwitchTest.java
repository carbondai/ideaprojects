package com.company;

import java.util.Scanner;

/**
 * Created by ht706 on 18-2-1.
 */
public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            String s = scanner.nextLine();
            if(!s.isEmpty()) {
                switch (s) {
                    case "abc":
                        System.out.println("alpha beta table");
                        break;
                    case "hello":
                        System.out.println("world");
                        break;
                    default:
                        System.out.println("default");
                        break;

                }
            } else {
                break;
            }

        }


    }
}

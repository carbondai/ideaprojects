package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

/**
 * Created by ht706 on 18-1-24.
 */
class ThreadLocalDemo extends Thread {
    static int count1 = 0;
    public synchronized void increase() {
        count1++;
        decrease();
    }
    public synchronized void decrease() {
        count1--;
    }

    ThreadLocal<Integer> count = new ThreadLocal<Integer>(){
        public Integer initialValue() {
            return 0;
        }
    };
    public void run() {
        System.out.println(Thread.currentThread().getName()+"enter");
        for(int i = 0; i < 10000000; i++) {
            count.set(count.get() + 1);
            increase();

        }
        System.out.println(Thread.currentThread().getName()+"exit");
    }
}
public class Test extends Object {
    public static void main(String[] args) throws InterruptedException{
        ThreadLocalDemo td1 = new ThreadLocalDemo();
        ThreadLocalDemo td2 = new ThreadLocalDemo();
        Thread t1 = new Thread(td1, "thread1");
        Thread t2 = new Thread(td2, "thread2");
        t1.start();
        t2.start();


        sleep(2000);
        System.out.print(ThreadLocalDemo.count1);
    }
}

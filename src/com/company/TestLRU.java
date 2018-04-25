package com.company;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ht706 on 18-4-13.
 */
public class TestLRU<K, V> extends LinkedHashMap<K, V> implements Map<K, V> {
    private static final long serialVersionUID = 1L;
    public TestLRU(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        if(size() > 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        TestLRU<Integer, Character> testLRU = new TestLRU<>(16, 0.75f, true);
        Map<Integer, Character> map = new HashMap<>(4,0.75f);
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<s.length(); i++) {
            testLRU.put(i, s.charAt(i));
            map.put(i<<20, s.charAt(i));
        }
        /*
        System.out.println(testLRU.get(21));
        System.out.println(testLRU.size());
        System.out.println(testLRU);
        testLRU.put(26, 'a');
        System.out.println(testLRU);
        System.out.println(map);
        */
    }
}

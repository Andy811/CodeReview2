package com.andeji;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap hashmap = new HashMap<String, Integer>();
        String str = "This is a book. That is a pencil.This is good, and that is bad.";

        String x = str.replaceAll("[\\W]", " ");
        x = x.toLowerCase();

        String[] xx = x.split(" ");
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }

        for (int i = 0; i < xx.length; i++) {
            if (hashmap.containsKey(xx[i])) {
                Integer num = (Integer) hashmap.get(xx[i]);
                num++;
                hashmap.put(xx[i],  num);
            } else {
                hashmap.put(xx[i], 1);
            }
        }
        for (Object key: hashmap.keySet()) {
            System.out.println(key+" : "+hashmap.get(key));
        }
    }
}

package com.ahmad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 17 Jun 2022
 * @author Bashir Ahmad
 */
public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmad");
        list.add("Mohammad");
        list.add("Dawood");
        list.add("Ebrahim");
        list.add("Esmayel");
        System.out.println(list);
        
        List<String> l = list.stream().filter(s -> s.length() >= 6).collect(Collectors.toList());
        System.out.println(l);
        
        List<String> l2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
        
        long count = list.stream().filter(s -> s.length() >= 6).count();
        System.out.println("The number of String whose length >= 6: "+count);
    }
}

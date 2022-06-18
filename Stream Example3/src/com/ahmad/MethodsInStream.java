package com.ahmad;

import java.util.ArrayList;

/**
 * @author Bashir Ahmad
 */
public class MethodsInStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("BB");
        list.add("CCC");
        
        list.stream().forEach(s -> System.out.println(s));
        
        list.stream().forEach(System.out :: println);
        
    }
}

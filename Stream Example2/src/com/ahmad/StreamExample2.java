package com.ahmad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 17 Jun 2022
 * @author Bashir Ahmad
 */
public class StreamExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(25);
        System.out.println(list);
        
        List<Integer> l1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("List According to Default Natural Sorting Order: "+ l1);
        
        List<Integer> l2 = list.stream().sorted((i1, i2) -> - i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("List According to Customized Sorting Order: "+ l2);
        
        Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum Value is: "+ min);
        
        Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum Value is: "+ max);
        
        Integer[] array = list.stream().toArray(Integer[] :: new);
        for(Integer x : array){
            System.out.println(x);
        }
        
        Stream<Integer> s1 = Stream.of(9,99,999,9999,99999,999999);
        s1.forEach(System.out :: println);
    }
}

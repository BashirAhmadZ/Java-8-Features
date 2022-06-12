package ahmad.it;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 09 Jun 2022
 * @author Bashir Ahmad
 * Functional Interface With Lambda Expression
 * 
 * Lambda Expression is just an anonymous function. That means the function which does not have the name, return type and access modifiers
 * 
 * Why Use Lambda?
 * + To Enable Functional Programming.
 * + To write more readable, maintainable, and clean concise code.
 * + To use API very easily and effectively.
 * + To enable parallel processing.
 */

/** 
Without ussing Lambda Expression...
class MyComprator implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        /*
        if(i1>i2) return -1;
        else if (i1<i2) {
            return +1;
        }
        else
        return 0;
        //Here Write close Multiline comment.
        //or 
        return (i1>i2)?-1:(i1<i2)?+1:0;
    }
}
*/
public class SortingList {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(0);
        arrList.add(15);
        arrList.add(5);
        arrList.add(20);
        System.out.println("Befor Sorting: "+arrList);
        /* 
        Without Using Lambda ...... 
        //for customiz soting we implement Comparator without using Lambda
        Collections.sort(l, new MyComprator());//
        System.out.println("After Sorting: "+l);
        */
        
        //Here Using Lambda Expression...
        Collections.sort(arrList, (n1,n2)->(n1>n2)?-1:(n1<n2)?1:0);
        System.out.println("After Sorting: "+arrList);
    }
}

package ahmad.it;

import java.util.TreeSet;

/**
 * @author Bashir Ahmad
 */
public class SortingTreeSet {
    public static void main(String[] args) {
        //TreeSet Using Lambda Expression
        TreeSet<Integer> t = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(25);
        t.add(5);
        t.add(20);
        System.out.println(t);
    }
}

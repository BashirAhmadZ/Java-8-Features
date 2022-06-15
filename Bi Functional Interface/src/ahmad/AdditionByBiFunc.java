package ahmad;

import java.util.function.BiPredicate;

/**
 * 
 * @author Bashir Ahmad
 */
public class AdditionByBiFunc {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p=(a,b)->(a+b) %2==0;
        System.out.println(p.test(10,20));
        System.out.println(p.test(15,20));
    }
}

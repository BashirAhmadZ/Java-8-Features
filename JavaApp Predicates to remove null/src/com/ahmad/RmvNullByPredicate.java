
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 11 Jun 2022
 * @author Bashir Ahmad
 * JAVA App using Predicate to Remove null values and Empty String from the given List.
 * 
 * 
 * 
 * 
 * A predicate is a function with a single argument and returns boolean value.
 * To implement predicate functions in Java, Oracle people introduced Predicate interface in 1.8 
        version
 * Predicate interface present in Java.util.function package.
 * It’s a functional interface and it contains only one method.
 */
public class RmvNullByPredicate {
    
    public static void main(String[] args) {
        
        String[] names = {"Ahmad", "", null, "Mahmood", "Abdullah", "", null, "Ali"};
        
        Predicate<String> pre = s->s !=null && s.length() != 0;
        ArrayList<String> list = new ArrayList<String>();
        
        for(String s : names){
            if(pre.test(s)){
                list.add(s);
            }
        }
        System.out.println("The List of Valid Names are: ");
        System.out.println(list);
    }
}

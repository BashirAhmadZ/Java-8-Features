package ahmad;

import java.util.function.ToIntFunction;

/**
 * @author Bashir Ahmad
 */
public class FindStringLength {
    public static void main(String[] args) {
        ToIntFunction<String> f=s->s.length();
        System.out.println(f.applyAsInt("durga"));
    }
}

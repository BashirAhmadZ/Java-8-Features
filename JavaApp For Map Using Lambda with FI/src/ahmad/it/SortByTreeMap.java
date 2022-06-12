package ahmad.it;

import java.util.TreeMap;

/**
 * @author Bashir Ahmad
 */
public class SortByTreeMap {
    public static void main(String[] args) {
        //TreeSet Using Lambda Expression
        TreeMap<Integer, String> m = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        m.put(100,"ALI");
        m.put(500, "Ahmad");
        m.put(300, "Mohammad");
        m.put(200, "Mahmood");
        m.put(400, "Maqsood");
        System.out.println(m);
    }
}

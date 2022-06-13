interface StaticMthd {
    //we can use static method inside interface from Java 1.8 onwords.
    public static void sum(int a, int b){
        System.out.println("The Sum is = "+(a+b));
    }
}
/**
 *
 * @author Bashir Ahmad
 */
public class StaticMthdImpl implements StaticMthd {
    
    public static void main(String[] args) {
        
        StaticMthd.sum(10, 20);
    }
}

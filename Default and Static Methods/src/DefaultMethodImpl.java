interface WthDefaultMthd {
    //we can use default method inside interface from Java 1.8 onwords.
    default void method1(){
        System.out.println("Interface Default()");
    }
}

/**
 * 11 Jun 2022
 * @author Bashir Ahmad
 */
public class DefaultMethodImpl implements WthDefaultMthd {
    
    public static void main(String[] args) {
        
        DefaultMethodImpl test = new DefaultMethodImpl();
        test.method1();
    }
}

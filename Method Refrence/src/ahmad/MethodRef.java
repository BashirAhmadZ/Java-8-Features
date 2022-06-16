package ahmad;
/**
 * 15 Jun 2022
 * @author Bashir Ahmad
 */
interface functionalInter {
    public void m1();
}

public class MethodRef {
    public static void m2(){
        System.out.println("Method Refrence Method!");
    }
    
    public static void main(String[] args) {
        functionalInter i = MethodRef :: m2;
        i.m1();
    }
}

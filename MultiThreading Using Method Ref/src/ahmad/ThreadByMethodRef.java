package ahmad;
/**
 * @author Bashir Ahmad
 */
public class ThreadByMethodRef {
    
    public void m1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Sub Thread");
        }
    }
    
    public static void main(String[] args) {
        ThreadByMethodRef t = new ThreadByMethodRef();
        Runnable r = t :: m1;
        Thread thread = new Thread(r);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ");
        }
    }
}

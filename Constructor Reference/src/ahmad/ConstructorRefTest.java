package ahmad;
/**
 * 16 Jun 2022
 * @author Bashir Ahmad
 */
class Sample{

    public Sample() {
        System.out.println("Sample Class Constructor & Object Creation!");
    }
}

interface Interf{
    
    public Sample get();
}

public class ConstructorRefTest {

    public static void main(String[] args) {
        Interf i = Sample :: new;
        Sample s = i.get();
    }
}

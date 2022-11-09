package predicate;
import java.util.function.*;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> P = I -> I > 10;
        System.out.println(P.test(100));
        System.out.println(P.test(2));
        if (P.test(107)){
            System.out.println("Greater than 10");
        } else{
            System.out.println("Less than 10");
        }
    }
}

package predicate;
import java.util.*;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        Predicate<Collection> P = c -> c.isEmpty();
        ArrayList L1 = new ArrayList();
        L1.add(23);
        System.out.println(P.test(L1));
        L1.remove(0);
        System.out.println(P.test(L1));
    }
}

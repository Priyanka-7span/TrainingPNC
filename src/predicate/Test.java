package predicate;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        Predicate<String> P = S ->S.length()>5;
        System.out.println(P.test("Priyanka"));
    }
}

package supplier;

import java.util.function.Supplier;

public class Date {
    public static void main(String[] args) {
        Supplier<java.util.Date> s= ()->new java.util.Date();
        System.out.println(s.get());
    }
}

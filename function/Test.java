package function;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        String s= "My Husband's name is Akshay.";
        Function<String,Integer> f=s1-> s1.length()- s1.replaceAll(" ","").length();
        System.out.println(f.apply(s));
    }
}
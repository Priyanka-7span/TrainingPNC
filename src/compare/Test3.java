package compare;
import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator3());
        t.add("A");
 /*       t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AAA"));*/
        t.add("ABC");
        t.add("AAA");
        t.add("XX");
        t.add("ABCD");
        t.add("ABCE");
        t.add("A");
        t.add("B");
        System.out.println(t);
    }
}

class MyComparator3 implements Comparator<String>{
    public int compare(String s1, String s2){
        int I1= s1.length();
        int I2 = s2.length();
        if (I1<I2)
            return -1;
        else if (I1>I2)
            return +1;
        else
            return s1.compareTo(s2);
    }
}

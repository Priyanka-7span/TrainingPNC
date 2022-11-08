package compare;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet t= new TreeSet(new MyComparator1());
        t.add(0);
        t.add(16);
        t.add(28);
        t.add(0);
        t.add(-17);
        t.add(16);
        System.out.println(t);
    }
}
class MyComparator1 implements Comparator{
    public int compare(Object obj1, Object obj2){
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        return -I1.compareTo(I2);
    }
}

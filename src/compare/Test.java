package compare;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet t= new TreeSet(new MyComparator());
        t.add(0);
        t.add(16);
        t.add(28);
        t.add(0);
        t.add(-17);
        t.add(16);
        System.out.println(t);
    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        if(I1<I2){
            return +1;}
        else if(I1>I2){
            return -1;}
        else{
            return 0;
        }
    }
}

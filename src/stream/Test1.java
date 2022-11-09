package stream;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(26);
        l.add(78);
        l.add(100);
        l.add(12);
        l.add(1680);
        l.add(-12);
        l.add(0);
        List<Integer>l1=l.stream().sorted().collect(Collectors.toList());
        System.out.println(l1);
        List<Integer>l2=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l2);
        Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }
}

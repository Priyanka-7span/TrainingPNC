package stream;

import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("ABCDEF");
        l.add("DFCE");
        l.add("RPLFSMVD");
        System.out.println(l);
        List<String> l1=l.stream().filter(s->s.length()>=5).collect(Collectors.toList()); //Why List? and not AL?
        System.out.println(l1);
        List<String> l2=l.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(l2);
        long p=l.stream().filter(s->s.length()>=5).count();
        System.out.println(p);
    }
}

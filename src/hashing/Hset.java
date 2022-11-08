package hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hset {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //list.add()
        System.out.println(set);

        //size
        System.out.println(set.size());

        //Iterator
        Iterator it = set.iterator();

        //hasNext, next
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //search - contains
        if(set.contains(1)){
            System.out.println("Cointains 1");
        }
        if(!set.contains(7)){
            System.out.println("Does not contain 7");
        }

        //remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We deleted 1");
        }

    }
}

package predicate;
import java.util.ArrayList;
import java.util.function.*;

public class Test4 {
    public static void main(String[] args) {
    String[] names= {"Priyanka","Akshay","Anaisha",null,"","Praneel"};
    Predicate <String> p=s -> s!=null && s.length()!=0;
    ArrayList <String> list= new ArrayList<String>();
    for(String s : names){
        if(p.test(s))
        {
            list.add(s);
        }
    }
        System.out.println("The list of valid number:");
        System.out.println(list);
    }
}
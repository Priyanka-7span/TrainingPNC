package compare;
import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet javaTeam = new TreeSet(new MyComparator2());
        javaTeam.add("Akshay");
        javaTeam.add("Priyanka");
        javaTeam.add("Maitri");
        javaTeam.add("Hetvi");
        javaTeam.add("Nandani");
        javaTeam.add("Pruthviraj");
        javaTeam.add("Rimpal");
        javaTeam.add("Avadhraj");
        javaTeam.add("Abhi");
        javaTeam.add("Anup");
        javaTeam.add("Harsh");
        System.out.println(javaTeam);
    }
}
class MyComparator2 implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1= (String) obj1;
        String s2= obj2.toString();
        return s2.compareTo(s1);
    }

}

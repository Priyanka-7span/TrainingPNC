package compare;
import java.util.*;
import java.lang.Comparable;

class Employee implements Comparable{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name + "__" + salary;
    }
    public int compareTo (Object obj){
        int salary1 = this.salary;
        Employee e = (Employee) obj;
        int salary2 = e.salary;
        if(salary1<salary2)
            return -1;
        else if (salary1>salary2)
            return +1;
        else
            return 0;
    }
}
public class CompComp {
    public static void main(String[] args) {
        Employee e1 =new Employee("Akshay",1000000000);
        Employee e2 = new Employee("Priyanka", 100000000);
        Employee e3 = new Employee("Geeta", 500);
        Employee e4 = new Employee("Babita", 10000);
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println(t);
        TreeSet t1 = new TreeSet(new MyCompare());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        System.out.println(t1);
        }
    }
class MyCompare implements Comparator{
    public int compare (Object obj1, Object obj2){
        Employee e1= (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1= e1.name;
        String s2= e2.name;
        return -s1.compareTo(s2);
    }
}
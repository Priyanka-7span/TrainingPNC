package function;
import java.util.ArrayList;
import java.util.function.*;

class Student1{
    String name;
    int rollno;
    public Student1(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
public class Bifu {
    public static void main(String[] args) {
        ArrayList<Student1> l=new ArrayList<>();
        BiFunction<String,Integer,Student1> f=(name,rollno)->new Student1(name,rollno);
        l.add(f.apply("Premlata",1));
        l.add(f.apply("Mandakini",2));
        for (Student1 s:l){
            System.out.println("Student name:"+s.name);
            System.out.println("Student rollno:"+s.rollno );
            System.out.println("*************************");
        }
    }
}

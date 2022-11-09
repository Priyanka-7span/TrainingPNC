package function;
import java.util.function.*;
import java.util.ArrayList;

class Student{
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Project {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);
        //Here, only individual student object is passed bcoz we need grade of individual student.
        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First]";
            } else if (marks >= 50) {
                return "C[Second]";
            } else if (marks >= 35) {
                return "D[Third]";
            } else {
                return "E[Failed]";
            }
        };
        Predicate<Student> p=s->s.marks>=60;
        for (Student s:l){
            if(p.test(s)) { //Predicate
                System.out.println("Student name:" + s.name);
                System.out.println("Student marks:" + s.marks);
                System.out.println("Student garde:" + f.apply(s)); //Function
                System.out.println("__________________________________");
            }
         }
    }
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Aks",89));
        list.add(new Student("Priya",100));
        list.add(new Student("Abhi",75));
        list.add(new Student("Divya",60));
        list.add(new Student("Pooja",25));
        list.add(new Student("Pratham",40));
    }
}

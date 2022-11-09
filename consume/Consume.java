package consume;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Consume {
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList<>();
        populate(l);

        Predicate<Student>p=s->s.marks>=60;
        Function<Student,String> f=s->{
            int marks=s.marks;
            if(marks>80){
                return "A";
            } else if (marks>60) {
                return "B";
            } else if (marks>50) {
                return "C";
            } else if (marks>=35) {
                return "D";
            } else {
                return "Failed";
            }
        };
        Consumer<Student>c=s->{
            System.out.println("Student name: "+s.name);
            System.out.println("Student marks: "+s.marks);
            System.out.println("Student grade: "+f.apply(s)); //Function
            System.out.println();
        };
        for (Student s:l){
            if (p.test(s)) //Predicate concept
            {
                c.accept(s); //Consumer
            }
        }
    }
    public static void populate(ArrayList<Student> l){
        l.add(new Student("Pinky",50));
        l.add(new Student("Chhagan",20));
        l.add(new Student("Magan",80));
        l.add(new Student("Chaman",75));
        l.add(new Student("Raman",60));
    }
}

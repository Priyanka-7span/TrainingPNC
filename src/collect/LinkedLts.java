package collect;
import java.util.LinkedList;
public class LinkedLts {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("A");
        student1.setRollNo(1);
        student1.setAge(10);
        student1.setEmail("email1");

        Student student2 = new Student();
        student1.setName("A");
        student1.setRollNo(1);
        student1.setAge(10);
        student1.setEmail("email1");

        Student student3 = new Student();
        student1.setName("A");
        student1.setRollNo(1);
        student1.setAge(10);
        student1.setEmail("email1");

        Student student4 = new Student();
        student1.setName("A");
        student1.setRollNo(1);
        student1.setAge(10);
        student1.setEmail("email1");

        LinkedList<Student> list = new LinkedList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        System.out.println(list);
    }
}

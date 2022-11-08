package collect;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<Student> getStudentObjects() {
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

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        return list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

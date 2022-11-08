package compare;

import java.util.*;

class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (age == student.age)
            return 0;
        else if (age > student.age)
            return 1;
        else
            return -1;
    }
}

public class DemoComparable {
    public static void main(String[] args) {

        Student s1 = new Student(1, "A", 9);
        Student s2 = new Student(2, "E", 23);
        Student s3 = new Student(3, "V", 12);
        Student s4 = new Student(4, "D", 88);
        Student s5 = new Student(5, "C", 7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println(studentList);

        Collections.sort(studentList);

        System.out.println(studentList);

/*
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        integerList.add(5);
        integerList.add(4);

        System.out.println(integerList);

        Collections.sort(integerList);

        System.out.println(integerList);*/
    }
}

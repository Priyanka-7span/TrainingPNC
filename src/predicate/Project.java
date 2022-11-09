package predicate;
import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
    String name;
    String designation;
    double salary;
    String city;
    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }
    //why toString method is override here? and why not in (function/salary)?
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
 }
public class Project {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);
//        System.out.println(list);
        Predicate<Employee> p1=employee -> employee.designation.equals("CEO");
        System.out.println("CEO Information:");
        display(p1,list);
        Predicate<Employee> p2=employee -> employee.city.equals("Mumbai");
        System.out.println("Mumbai located Employees are:");
        display(p2,list);
        Predicate<Employee> p3=employee -> employee.salary>100000;
        System.out.println("Employees having salary more than 100000 are:");
        display(p3,list);
        Predicate<Employee> p4=employee -> employee.designation.equals("Manager");
        System.out.println("Manager Information:");
        display(p4,list);
        System.out.println("Mumbai located Managers are:");
        display(p2.and(p4),list);
        System.out.println("Employees who are Managers and whose salary is greater than 100000");
        display(p4.or(p3),list);
    }
    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Akshay","CEO",10000000,"Ahmedabad"));
        list.add(new Employee("Priyanka","Director",50000000,"Ahmedabad"));
        list.add(new Employee("Abhi","Manager",100000,"Delhi"));
        list.add(new Employee("Rimpal","Developer",20000,"Mumbai"));
        list.add(new Employee("Anup", "Developer",10000, "Delhi"));
        list.add(new Employee("Arshi","Manager",50000,"Mumbai"));
        list.add(new Employee("Harsh","Manager",200000,"Ahmedabad"));
    }
    public static void display(Predicate<Employee> p,ArrayList<Employee> list){
        for (Employee employee: list){
            if (p.test(employee)){
                System.out.println(employee.designation);
            }
        }
        System.out.println("*******************************************");
    }
}
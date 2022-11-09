package function;
import java.util.ArrayList;
import java.util.function.*;
class Employee{
    public String name;
    public double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Salary {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);
        //why AL<E> has been passed as input in function? why not only employee? (like function/Project)
        //Ans: Here, Entire employee objects has been passed bcoz total of employee salary is asked.
        Function<ArrayList<Employee>, Object> f= l1->{
            double total=0;
            for (Employee e:l){
                total=total+e.salary;
            }
            return total;
        };
        System.out.println("Total salary of Employees: " + f.apply(l));
    }
    public static void populate(ArrayList<Employee>l){
        l.add(new Employee("Vish",30000));
        l.add(new Employee("Emma",50000));
        l.add(new Employee("Chacha",2700));
        l.add(new Employee("Puru",53729));
        l.add(new Employee("Mishu",16700));
    }
}
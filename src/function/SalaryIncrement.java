package function;
import java.util.function.*;
import java.util.ArrayList;

class SalaryIncrement extends Employee{
    public SalaryIncrement(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Salary.populate(list);
        System.out.println("Before Increment: ");
        System.out.println(list);
        Predicate<Employee> p=e->e.salary<35000;
        Function<Employee,Employee> f=e->{
            e.salary=e.salary+4770;
            return e;
        };
        System.out.println("After Increment: ");
        ArrayList<Employee> list2= new ArrayList<>();
        for(Employee e:list){
            if (p.test(e)){
                list2.add(f.apply(e));
            }
        }
        System.out.println(list);
        System.out.println("Employees with incremented salary: ");
        System.out.println(list2);
    }
}

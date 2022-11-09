package consume;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
class Employee{
    String name;
    double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class BiConsm {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        BiFunction<String,Double,Employee> f=(name,salary)->new Employee(name,salary);
        l.add(new Employee("Lulu",200));
        l.add(new Employee("Shizuka",1000));
        l.add(new Employee("Honululu",2600));
        l.add(new Employee("Shishimanu",8900));
        BiConsumer<Employee,Integer> c=(e,d)->e.salary=e.salary+d;
        for (Employee e:l){
            c.accept(e,500);
            System.out.println(e.name + " is having incremented salary: " + e.salary);
        }
    }
}
package function;

import java.util.function.BiFunction;

class Employee2{
    int eno;
    String name;
    double dailywage;
    public Employee2(int eno, String name, double dailywage) {
        this.eno = eno;
        this.name = name;
        this.dailywage = dailywage;
    }
}
class Timesheet{
    int eno;
    int days;
    public Timesheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }
}
public class EmployeeWage {
    public static void main(String[] args) {
        BiFunction<Employee2,Timesheet,Double> f=(e,t)->e.dailywage*t.days;
        Employee2 e = new Employee2(24,"PC",5000);
        Timesheet t = new Timesheet(24,30);
        System.out.println(e.name +"'s " + "employee Monthly Salary is: " +f.apply(e,t));
    }
}

package predicate;
import java.util.function.Predicate;
class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGF;
    public SoftwareEngineer(String name, int age, boolean isHavingGF) {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class Test5 {
    public static void main(String[] args) {
    SoftwareEngineer[] list = { new SoftwareEngineer("Akshay",33, true),
                                new SoftwareEngineer("Priyanka",31,false) };
    Predicate<SoftwareEngineer> allowed = se-> se.age>=18 && se.isHavingGF==true;
        System.out.println("The allowed members are:");
        for(SoftwareEngineer se: list){
            if(allowed.test(se))
            {
            System.out.println(se);
            }
        }
    }
}

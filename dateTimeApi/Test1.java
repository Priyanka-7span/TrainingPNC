package dateTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Test1 {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1991,8,13);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthdate,today);
        System.out.printf("Age is %d years, %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
    }
}

package predicate;
import java.util.function.Predicate;
import java.util.Scanner;

class User{
    String username;
    String password;
User (String username,String password){
    this.username=username;
    this.password=password;
    }
}
public class UserNameID {
    public static void main(String[] args) {
    Predicate<User> p=u->u.username.equals("Priyanka") && u.password.equals("PNC");
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter User Name");
        String username = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();
        User user=new User(username,password);
        if(p.test(user)){
            System.out.println("Valid user and can avail all services");
        } else{
            System.out.println("invalid user, you can't avail all services");
        }
    }
}

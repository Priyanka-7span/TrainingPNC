package construct;

public class Test {
    Test(double i){
        this(9);
        System.out.println("Double Argument called");
    }
    Test(int j){
        this();
        System.out.println("Integer Argument called");
    }
    Test (){
        System.out.println("No Argument called");
    }

    public static void main(String[] args) {
        Test t1 = new Test(10.5);
        Test t2= new Test(5);
        Test t3= new Test();
    }
}

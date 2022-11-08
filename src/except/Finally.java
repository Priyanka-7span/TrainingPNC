package except;

public class Finally {
    public static void main(String[] args) {
        try {
            int num1, num2, result;
            num1 = 5;
            num2 = 0;
            result = num1 / num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide a number by zero.");
        } finally{
            System.out.println("Thank you for using our calculator.");
        }
    }
}

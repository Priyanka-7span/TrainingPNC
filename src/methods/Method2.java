package methods;

import java.util.Scanner;

public class Method2 {
    public static void factorial(int n){
        if (n < 0){
            System.out.println("Invalid number!");
            return;
        }

        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}

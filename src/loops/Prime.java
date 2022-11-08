package loops;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean isPrime = false;

        for ( int n = 1; n <= i; n++){
            if(i == 1) {
                System.out.println("Not a Prime number!");
                break;
            }
            if (i % n == 0 && n != 1 && n != i) {
                isPrime = false;
                System.out.println("Not a Prime number!");
                break;
            }
            isPrime = true;
        }
        if(isPrime) {
            System.out.println("Prime Number");
        }
    }
}

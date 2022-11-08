package exercise1;

import java.util.Scanner;

public class Solution8 {
    public static void pow (double n, double x){
        double power = Math.pow(n,x);
        System.out.println("The power is" + " " + power);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        pow(n,x);

    }
}

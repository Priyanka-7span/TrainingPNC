package exercise1;

import java.util.Scanner;

public class Solution3 {
    public static void greaterNumber(int a, int b){
        if (a > b){
            System.out.println("Greater number is" + " "+ a);
        }else if (a < b){
            System.out.println("Greater number is" + " " + b);
        }else{
            System.out.println("Both are equal!");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNumber(a,b);
    }
}

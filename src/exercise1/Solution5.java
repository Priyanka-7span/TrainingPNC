package exercise1;

import java.util.Scanner;

public class Solution5 {
    public static void isEligibleToVote (int age){
        if (age >=18){
            System.out.println("The candidate is eligible to vote!");
        }else{
            System.out.println("The candidate is not eligible to vote!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        isEligibleToVote(age);
    }
}

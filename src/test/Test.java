package test;

import java.util.Scanner;

public class Test {
 public static void main (String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("please add input : ");
     int userInput = sc.nextInt();

     System.out.println("please add String : ");
     String userValue = sc.next();
     System.out.println("User added values : "+userInput);
     System.out.println("User added String : "+userValue);
     System.out.println("Testing Commit");
    }
}
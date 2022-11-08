package exercise1;

import java.util.Scanner;

public class Solution4 {
    public static void circumferenceOfCircle (double r){
        double circumference = 2*3.14*r;
        System.out.println("circumference of circle is" + " " + circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumferenceOfCircle(r);
    }
}

package exercise1;

import java.util.Scanner;
//
public class Solution1 {
    public static float calculateAverage(float a, float b, float c){
        float average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average= calculateAverage(a,b,c);

        calculateAverage(a,b,c);
        System.out.println("Average of a,b,c is"+ " " + average);
    }
}

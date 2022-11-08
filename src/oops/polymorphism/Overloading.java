package oops.polymorphism;

class DemoOverloading {

    String name;
    int age;

    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    public int sum(int a, int b, int c) {
        System.out.println(a+b+c);
        return a+b+c;
    }
}


public class Overloading {
    public static void main(String[] args) {

    }
}

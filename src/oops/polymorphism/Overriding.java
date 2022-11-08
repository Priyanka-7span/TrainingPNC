package oops.polymorphism;

public class Overriding {
    double area;

    double area(double length, double breadth) {
        area = length * breadth;
        return area;
    }

    double area(double side) {
        area = side * side;
        return area;
    }

    public static void main(String[] args) {
        Overriding area = new Overriding();
        System.out.println("Area of the rectangle is," + area.area(5, 2));
        System.out.println("Area of the square is," + area.area(5));
    }
}
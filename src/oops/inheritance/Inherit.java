package oops.inheritance;

class Vehicle{
    String color;
    int numberOfWheels;
    private int price;

    //getter & setter
    public int getPrice(){
        setPrice(80000);
        return this.price;
    }
    private void setPrice (int price){
        this.price = price;
    }
}
//inheritance
class Scooter extends Vehicle{
    public void printWheels() {
        System.out.println(numberOfWheels);
    }
}
class Car extends Vehicle {
    public void printColor(){
        System.out.println(color);
    }
}


public class Inherit {
    public static void main(String[] args) {
        Scooter a1 = new Scooter();
        a1.color = "Gray";
        a1.numberOfWheels = 2;
        //private variable access
        //a1.setPrice(90000);
        System.out.println(a1.getPrice());

        a1.printWheels();

        Car c1 = new Car();
        c1.color = "blue";
        c1.printColor();

        //imported class
        Pen pen4 = new Pen();
        pen4.color= "Yellow";
        pen4.printColor();
    }
}
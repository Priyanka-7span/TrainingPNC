package oops.abstraction;
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Animal is created");
    }
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abs {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.eats();
    }
}
package oops.inheritance;

class Pen {
    String type;
    int quantity;
    String color;
    public void printColor(){
        System.out.println("Executed!");
        System.out.println(color);
    }

//    Pen(String type, int quantity, String color){
//        this.type = type;
//        this.color = color;
//        this.quantity = quantity;
//    }
}

public class This {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.type = "gel";
        pen1.color ="blue";
        pen1.quantity = 2;
//
        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "glitter";
//
//        Pen pen3 = new Pen("Fountain", 3, "green");
//
        pen1.printColor();
        pen2.printColor();
//        pen3.printColor();

    }

}

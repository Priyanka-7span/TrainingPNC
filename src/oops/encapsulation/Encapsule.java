package oops.encapsulation;

class Actor {
    String name; // initials of the name of the actor
    float actingSkills; // rate from 1-10;
    float looks; // rate from 1-10;
    float popularity; // rate from 1-10;

    public Actor() {
        this.name = "Default Name";
    }

    public Actor(String name, float v, float v1, float v2) {
        this.name = name;
    }

    public void printValue() {
        System.out.println(name);
        System.out.println(this.name);
    }
}
    public class Encapsule{
        public static void main(String[] args) {
            Actor a1 = new Actor("Test",1.0f,2.0f,3.0f);
            a1.name = "Test1";
            a1.printValue();
            a1.printValue();
            a1.printValue();

            Actor a2 = new Actor("Test2",10.0f,20.0f,30.0f);
            a2.name = "Test2";
            a2.printValue();
        }
    }
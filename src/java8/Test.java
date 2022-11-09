package java8;

interface Left{
    default void m1(){
        System.out.println("Left interface");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right interface");
    }
}
class Test implements Left {
    public void m1(){
        Left.super.m1();
        //System.out.println("My own implementation");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}

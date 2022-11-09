package lambda;

interface Interf{
    public void add(int a, int b);
}
//class Demo implements Interf{
//    public void add (int a, int b ){
//       // System.out.println("The sum is" + (a+b));
//    }
//}
public class Test {
    public static void main(String[] args) {
        Interf i = (a,b)-> System.out.println("The sum is " + (a+b));
        i.add(200,50);
        i.add(100,300);
    }
}

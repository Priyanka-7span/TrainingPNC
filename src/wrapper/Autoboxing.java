package wrapper;

public class Autoboxing {
    public static void main(String[] args) {
        int num = 5;
        Integer numObj = num; //without using the valueOf() method
        System.out.println(num);
        System.out.println(numObj instanceof Integer);
    }
}

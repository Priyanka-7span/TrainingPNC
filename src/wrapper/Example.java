package wrapper;

public class Example {
//    public static void main(String[] args) {
//        Example example = new Example();
//        System.out.println(example instanceof Example);
//    }

    //primitive to object
//    public static void main(String[] args) {
//        int num = 5;
//        Integer numObj = Integer.valueOf (num);
//        System.out.println(numObj);
//        System.out.println(numObj instanceof Integer);
//    }

    //object to primitive
    public static void main(String[] args) {
        Integer numObj = 5;
        int num = numObj.intValue();
        System.out.println(num);
    }
}

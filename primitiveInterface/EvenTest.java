package primitiveInterface;

import java.util.function.IntPredicate;

public class EvenTest {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        IntPredicate p = i-> i%2==0;
        for (int x1: x){
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }
}
package supplier;

import java.util.function.Supplier;

public class Name {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String[] s1={"Shinchen","Doremon","Nobita","Himavari","Shizuka"};
            int x = (int) (Math.random()*4);
            return s1[x];
        };
        System.out.println(s.get());
    }
}

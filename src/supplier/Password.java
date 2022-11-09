package supplier;

import java.util.function.Supplier;

public class Password {
    public static void main(String[] args) {
        Supplier<String> s=()->{
          Supplier<Integer> d=()->(int)(Math.random()*10);
          String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
          Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
          String psw = "";
          for (int i=0; i<8;i++){
              if (i%2==0) {
                  psw=psw+d.get();
              } else {
                  psw=psw+c.get();
              }
          }
          return psw;
        };
        System.out.println(s.get());
    }
}

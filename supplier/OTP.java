package supplier;

import java.util.function.Supplier;

public class OTP {
    public static void main(String[] args) {
        Supplier<Integer> otp=()->{
            int x = (int) (Math.random()*1000000000);
            return x;
        };
        System.out.println(otp.get());
    }
}

import java.util.*;
import java.math.*;
public class Sub_bigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = a.subtract(b);
            String d = c.abs().toString();
            if(d.toString()== "-0")
                System.out.println(0);
            else
                System.out.println(c);
        
    }
}
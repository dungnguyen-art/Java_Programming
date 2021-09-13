import java.util.*;
import java.math.*;
public class Sum_bigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
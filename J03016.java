import java.math.BigInteger;
import java.util.*;

public class J03016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            String s = in.next();
            long sOdd = 0, sEven = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    sOdd += s.charAt(i) - '0';
                } else
                    sEven += s.charAt(i) - '0';
            }
            // System.out.println(sEven);
            if ((sOdd - sEven) % 11 == 0) {
                System.out.println(1);
            } else
                System.out.println(0);
        }
    }
}

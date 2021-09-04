import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        while (T-->0) {
            long n = inp.nextLong();
            boolean ok = true;
            if (n < 2)
                ok = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

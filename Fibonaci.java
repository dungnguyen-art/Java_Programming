import java.util.*;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a[] = new long[100];
            a[0] = 0;
            a[1] = 1;
            long n = in.nextLong();
            if (n == 0 || n == 1)
                System.out.println("YES");
            else {
                for (int i = 2; i < 93; i++) {
                    a[i] = a[i - 1] + a[i - 2];
                    if (a[i] == n) {
                        System.out.println("YES");
                        break;
                    } else if (a[i] > n) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
    }
}

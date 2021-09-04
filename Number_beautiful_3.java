import java.util.*;

public class Number_beautiful_3 {
    public static boolean Prime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0) {
            String s = in.next();
            int k = s.length();
            boolean check = true, check1 = true;
            for (int i = 0; i <= k / 2; i++) {
                if (s.charAt(i) != s.charAt(k - 1 - i)) {
                    check = false;
                    break;
                }
            }
            for (int i = 0; i < k; i++) {
                int tmp = Character.getNumericValue(s.charAt(i));
                if (Prime(tmp) == false) {
                    check1 = false;
                    break;
                }
            }
            if (check == true && check1 == true) {
                    System.out.println("YES");
            } else {
                    System.out.println("NO");
            }
        }
    }
}

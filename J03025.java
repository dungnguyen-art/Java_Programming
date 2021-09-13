import java.util.*;

public class J03025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            // int k = s.length();
            // System.out.println(k);
            int cnt = 0;
            for (int i = 0; i <= (int)(s.length()/2); i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    cnt++;
                }
            }
            if (s.length() % 2 == 1 && cnt == 0)
                System.out.println("YES");
            else {
                if (cnt == 1)
                    System.out.println("YES");
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
// abccaa
import java.util.*;

public class J02032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-->0) {
            int n = in.nextInt();
            int a[] = new int[1001];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int k = 1;
            Stack<String> mys = new Stack<>();
            for (int i = 0; i < n; i++) {
                boolean ok = true;
                for (int j = 0; j < n - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int t = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = t;
                        ok = false;
                    }
                }
                if (!ok) {
                    k++;
                    String s = "";
                    for (int h = 0; h < n; h++) {
                        s += Integer.toString(a[h]);
                        s += " ";
                    }
                    mys.push(s);
                }

            }
            for (int i = k - 1; i >= 1; i--) {
                System.out.print("Buoc " + i + ": ");
                System.out.println(mys.peek());
                mys.pop();
            }
        }
    }
}

import java.util.*;

public abstract class J02029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-->0) {
            int n = in.nextInt();
            int a[] = new int[10001];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int k = 1;
            Stack<String> mys = new Stack<>();
            for (int i = 0; i < n - 1; i++) {
                boolean ok = true;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) {
                        int t = a[j];
                        a[j] = a[i];
                        a[i] = t;
                        ok = false;
                    }
                }
                if (!ok) {
                    String s = "";
                    k++;
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

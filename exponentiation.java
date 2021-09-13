import java.util.*;

public class exponentiation {
    public static long m = 1000000007;

    public static void main(String[] args) {
        int t = 5;
        while(t>0){
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            long b = in.nextLong();
            if (a == 0 && b == 0){
                t = 0;
            }
            else{
            System.out.println(cal(a,b));
            }
        }

    }

    public static long cal(int a, long b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return (cal(a,(long) b / 2) % m) * (cal(a,(long) b / 2) % m) % m;
        else
            return (a%m) * (cal(a, (long)b/2)%m) * (cal(a,(long)b/2) % m) % m;
    }
}

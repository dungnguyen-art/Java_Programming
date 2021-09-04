import java.util.*;
public class GCD_LCM_2 {
    public static long GCD(long a,long b) {
        long tmp = 0;
        while(b!=0){
            tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long res = 1;
            long gcd = 1;
            for(int i=1;i<=n;i++){
                gcd = GCD(i, res);
                res = (i*res)/gcd;
            }
            System.out.println(res);
        }
    }    
}

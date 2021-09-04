import java.util.*;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            long a = in.nextLong();
            long b = in.nextLong();
            long x = a,y = b;
            long GCD = 0;
            long LCM = 0;
            long tmp = 0;
            while(b!=0){
                tmp = b;
                b = a%b;
                a = tmp;
            }
            GCD = a;
            LCM = (x*y)/GCD;
            System.out.println(LCM + " " + GCD);
        }
    }
}

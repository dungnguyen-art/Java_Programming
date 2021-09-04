import java.util.*;

public class Fibonacci {
    public static long[] f = new long[100];
    public static void createFibo(long n){
        if (n <= 2) {
            System.out.println(1);
        }
        f[1] = 1;
            f[2] = 1;
            for(int i=3;i<=92;i++){
                f[i] = f[i-1] + f[i-2];
                if(i==n){
                    System.out.println(f[i]);
                    break;
                }
            }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        while(T-->0){
            long n = inp.nextLong();
            createFibo(n);
        }
        inp.close();
    }
}

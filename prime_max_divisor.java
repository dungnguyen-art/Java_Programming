//import java.util.Scanner;
import java.util.*;
public class prime_max_divisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0) {
            long n = in.nextLong();
            long maxPrime = -1;
            while (n%2 == 0) {
                maxPrime = 2;
                n /= 2;
            }

            for (int i=3;i<=Math.sqrt(n);i +=2){
                while(n%i == 0){
                    maxPrime = i;
                    n/=i;
                }
            }
            if(n>2)
                maxPrime = Math.max(maxPrime,n);
            System.out.println(maxPrime);
        }
    }
}
import java.util.*;
public class Sum_div {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long sum = 0;
        while(t-->0){
            long n  = in.nextLong();
            if(n<2)
                sum += 0;
            else{
                while(n%2 == 0){
                    sum += 2;
                    n/=2;
                }
                for(long i=3;i<= Math.sqrt(n);i+=2){
                    while(n%i == 0){
                        sum += i;
                        n /= i;
                    }
                }
                if(n>2)
                    sum += n;
            }
        }
        System.out.println(sum);
    }
}

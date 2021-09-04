import java.util.*;

public class divisorDivisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            long n = in.nextLong();
            int res = 0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    if(i%2 == 0)
                        res++;
                    if((n/i)%2 == 0 && n/i != i)
                        res++;
                }
            }

            System.out.println(res);
        }
    }
}

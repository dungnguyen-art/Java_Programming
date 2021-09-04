import java.util.*;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=1;i<=T;i++){
            // System.out.println(i);
            long n = in.nextLong();
            System.out.print("Test " + i + ": ");
            for(int j=2;j<=Math.sqrt(n);j++){
                int cnt = 0;
                while(n%j == 0){
                    cnt++;
                    n/=j;
                }
                if(cnt !=0)
                    System.out.print(j + "(" + cnt + ") ");
            }
            if(n>1)
                System.out.print(n + "(" + 1 + ")");
            System.out.println();
        }
    }
}
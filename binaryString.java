import java.util.*;

public class binaryString {
    public static long[] b = new long[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long k = in.nextLong();
            //use array b for save length of sequence nth.
            b[1] = 1; b[2] = 1;
            for (int i=3;i<93;i++){
                b[i] = b[i-1] + b[i-2];
            }
            System.out.println(Processed(n, k));
        }
    }
    public static char Processed(int n,long k) {
        if (n==1)
            return '0';
        if (n==2)
            return '1'; 
        if(k<=b[n-2])
            return Processed(n-2,k);
        else
            return Processed(n-1,k-b[n-2]);
    }
}
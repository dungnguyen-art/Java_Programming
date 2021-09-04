import java.util.Scanner;

public class SymmetricalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            int n = in.nextInt();
            long Array[] = new long[101];
            for(int i=0;i<n;i++)
                Array[i] = in.nextLong();
            boolean check = true;
            for(int i=0;i<=n/2;i++){
                if(Array[i] != Array[n-1-i]){
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

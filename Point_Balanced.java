import java.util.*;
public class Point_Balanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            int n = in.nextInt();
            long a[] = new long[n];
            long sum = 0;
            for(int i=0;i<n;i++){
                a[i] = in.nextLong();
                sum += a[i];
            }
            boolean check = false;
            if(n < 3)
                System.out.println("-1");
            else{
                long sTmp = a[0];
                for(int i=1;i<n;i++){
                    if(sTmp == sum-sTmp-a[i]){
                        check = true;
                        System.out.println(i+1);
                        break;
                    }
                    else{
                        sTmp += a[i];
                    }
                }
                if(check == false)
                    System.out.println("-1");
            }
        }
    }
}

import java.util.*;
public class CountO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int k=1;k<=T;k++){
            long n = in.nextLong();
            int ar[] = new int[100001];
            int Ha[] = new int[100001];
            Arrays.fill(Ha, 0);
            boolean check[] = new boolean[100001];
            for(int i=0;i<n;i++){
                ar[i] = in.nextInt();
                check[ar[i]] = true;
                Ha[ar[i]]++;
            }
            System.out.println("Test "+ k +":" );
            for(int i=0;i<n;i++){
                if(check[ar[i]]){
                    System.out.println(ar[i]+" xuat hien "+ Ha[ar[i]] + " lan");
                    check[ar[i]] = false;
                }
            }
        }
        in.close();
    }
}

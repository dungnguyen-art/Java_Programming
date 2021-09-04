import java.util.*;
public abstract class Direct_Echange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[10001];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int k = 1;
        for(int i=0;i<n-1;i++){
            boolean ok = true;
            int x = i;
            for(int j=i+1;j<n;j++){
                if(a[j] < a[x]){
                    x = j;
                    ok = false;
                }
            }
            if(!ok){
                int t = a[x];
                a[x] = a[i];
                a[i] = t;
                System.out.print("Buoc "+ k + ": ");
                k++;
                // System.out.println(Arrays.toString(a));
                for(int h = 0;h<n;h++)
                    System.out.print(a[h] + " ");
            }
            System.out.println();
        }
    }
}

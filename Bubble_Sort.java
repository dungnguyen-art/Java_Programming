import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[1001];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int k = 1;
        for(int i=0;i<n;i++){
            boolean ok = true;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t; 
                    ok = false;
                }
            }
            if(!ok){
                System.out.print("Buoc "+k+": ");
                k++;
                for(int h = 0;h<n;h++)
                    System.out.print(a[h]+" ");
                System.out.println();
            }

        }
    }
}

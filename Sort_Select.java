import java.util.*;
public abstract class Sort_Select {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int k = 1,min = 0;

        for(int i=0;i<n-1;i++){
           min = i;
           boolean ok = true;
           for(int j=i+1;j<n;j++){
               if(a[j] < a[min]){
                   min = j;
                   ok = false;
               }
           }
           
               int t = a[i];
               a[i] = a[min];
               a[min] = t;
            System.out.print("Buoc "+(i+1)+": ");
           
            for(int h = 0;h<n;h++)
                System.out.print(a[h]+" ");
            System.out.println();
           
        }
    }
}

import java.util.*;
public class Sort_Insert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[105];
        int b[] = new int[105];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            b[i] = 0;
        }
        b[0] = a[0];
        int index = 1;
        int k = 0;
        System.out.println("Buoc " + k + ": " + b[0]);
        k++;
        for(int i=1;i<n;i++){
            if(a[i]>b[index-1]){
                b[index] = a[i];
                // index ++;
            }
            else{
                int x = 0;
                for(int j=index;j>0;j--){
                    b[j] = b[j-1];
                    if(b[j-1]<a[i]){
                        x = j;
                        break;
                    }
                }
                b[x] = a[i];
            }
            index ++;
            System.out.print("Buoc "+k+": ");
            k++;
            for(int j=0;j<index;j++)
                System.out.print(b[j]+" ");
            System.out.println();
        }
        
    }    
}

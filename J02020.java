import java.util.*;
public class J02020 {
    public static int[] a = new int[100];
    public static int k,n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Init();
        // display();
        int cnt = 0;
        while(!check()){
            display();
            Next();
            cnt++;
        }
        display();
        System.out.println("Tong cong co "+(cnt+1)+" to hop");
    }
    public static void Init(){
        for (int i=1;i<=k;i++)
            a[i] = i;
    }
    public static boolean check(){
        for (int i=1;i<=k;i++){
            if(a[i] != n-k+i)
                return false;
        }
        return true;
    }
    public static void Next(){
        int i = k;
        while(a[i] == n-k+i)
            i--;
        if (i>0){
            a[i] += 1;
            for (int j = i+1;j<=k;j++)
                a[j] = a[j-1] + 1;
        }
    }
    public static void display(){
        for (int i=1;i<=k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

import java.util.*;
public class adjacency_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] a = new int[1001][1001];
        for (int i=1;i<=t;i++){
            for (int j=1;j<=t;j++){
                int x = in.nextInt();
                a[i][j] = x;
            }
        }

        for (int i=1;i<=t;i++){
            System.out.print("List("+i+")"+" = ");
            for (int j=1;j<=t;j++){
                if(a[i][j]==1 && i!=j)
                    System.out.print(j+" ");                
            }
            System.out.println();
        }
    }
}

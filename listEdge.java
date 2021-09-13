import java.util.*;
public class listEdge {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int k = in.nextInt();
                if (k==1 && i < j){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}

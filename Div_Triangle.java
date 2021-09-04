import java.util.*;
public class Div_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            Double n = in.nextDouble();
            Double h = in.nextDouble();
            // double x = 0;
            for(int i=1;i<n;i++){
                double res = Math.sqrt((h*h*i)/n);
                System.out.printf("%.6f ",res);
            }
            System.out.println();
        }
    }    
}

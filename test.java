import java.util.Scanner;

public class XauNhiPhan {
    public static long[] x = new long[93];
    public static void xau(){
        x[1] = 1;
        x[2] = 1;
        for(int i = 3; i < 93; i++){
            x[i] = x[i-2] + x[i-1]; // tinh do dai cua cac xau
        }
    }
    public static void solution(int n, int k){
        while(n > 2){ // vd: n = 6 : 101/01101
            if(k <= x[n-2]) n -= 2; // neu k nho hon xet xau x[n-2]
            else{ 
                k -= x[n-2]; // xet trong xau x[n-1]
                n -= 1; // giam di 1 de xet xau n-1
            }
        }
        if(n == 1){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        xau();
        while(test-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            solution(n, k);
        }
    }
}
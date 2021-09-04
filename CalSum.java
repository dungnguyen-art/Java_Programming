import java.util.Scanner;

public class CalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            long n = in.nextLong();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }
}

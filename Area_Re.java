import java.security.Principal;
import java.util.*;

public class Area_Re {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n<=0 || m <= 0)
            System.out.println("0");
        else {
            int c = (n+m)*2;
            int s = n*m;
            System.out.println( c+" "+s);
        }
    }
}

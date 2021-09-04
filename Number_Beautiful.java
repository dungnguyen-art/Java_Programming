import java.util.*;
public class Number_Beautiful {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            String s = in.next();
            int n = s.length();
            // System.out.println(n);
            boolean check1 = true, check2 = true;
            for(int i=0;i<n;i++){
                if(Character.getNumericValue(s.charAt(i)) % 2 != 0){
                    check1 = false;
                    break;
                }
            }
            for(int i=0;i<=n/2;i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    check2 = false;
                    break;
                }
            }
            if(check1 == true && check2 == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

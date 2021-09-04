import java.util.*;
public class Number_beautiful_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            boolean check1 = true, check2 = true;
            int n = s.length();
            for(int i=0;i<=n/2;i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    check1 = false;
                    break;
                }
            }
            if(s.charAt(0) != '8' || s.charAt(n-1) !='8' )
                check2 = false;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += Character.getNumericValue(s.charAt(i));
            }
            if(sum%10 == 0 && check1 == true && check2 == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

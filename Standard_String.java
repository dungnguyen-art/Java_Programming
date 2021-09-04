import java.util.*;

public class Standard_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T =  Integer.parseInt(in.nextLine());
        while(T-->0){
            String s = in.nextLine();
            int len = s.length();
            String sTmp = "";
            boolean ok = false;
            for(int i=0;i<len;i++){
                if(s.charAt(i) != ' '){
                    sTmp = sTmp + s.charAt(i);
                    ok = true;
                }
                else if(ok == true){
                    sTmp = sTmp + " ";
                    ok = false;
                }
            }
            // System.out.println(sTmp);
            String s1 = new String(sTmp);
            s1 = sTmp.toLowerCase();
            len = sTmp.length();
            String res = "";
            // char ch='\0';
            // char fUpper = Character.toUpperCase(s1.charAt(0));

            // System.out.println(fUpper);
            // res = res + ch;
            for(int i=0;i<len;i++){
                if(i==0){
                    char ch = Character.toUpperCase(s1.charAt(i));
                    res = res + ch;
                }
                else if(s1.charAt(i-1) == ' '){
                    char ch = Character.toUpperCase(s1.charAt(i));
                    res = res + ch;
                }
                else
                    res = res + s1.charAt(i);
            }
            System.out.println(res);
        }
    }    
}

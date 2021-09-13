import java.util.*;
public class J02030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[105];
        int b[] = new int[105];
        Stack<String> mys = new Stack<>();
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            b[i] = 0;
        }
        b[0] = a[0];
        int index = 1;
        int k = 0;
        String sTmp = "";
        // System.out.println("Buoc " + k + ": " + b[0]);
        sTmp += Integer.toString(b[0]);
        mys.push(sTmp);
        k++;
        for(int i=1;i<n;i++){
            if(a[i]>b[index-1]){
                b[index] = a[i];
                // index ++;
            }
            else{
                int x = 0;
                for(int j=index;j>0;j--){
                    b[j] = b[j-1];
                    if(b[j-1]<a[i]){
                        x = j;
                        break;
                    }
                }
                b[x] = a[i];
            }
            index ++;
            // System.out.print("Buoc "+k+": ");
            k++;
            String s = "";
            for(int j=0;j<index;j++){
                s += Integer.toString(b[j]);
                s += " ";
            }
            mys.push(s);
            // System.out.println();
        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.print("Buoc " + i + ": ");
            System.out.println(mys.peek());
            mys.pop();
        }
        
    }    
}

import java.util.*;
public abstract class J02031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int k = 1,min = 0;
        Stack<String> mys = new Stack<String>();
        for(int i=0;i<n-1;i++){
           min = i;
           boolean ok = true;
           for(int j=i+1;j<n;j++){
               if(a[j] < a[min]){
                   min = j;
                   ok = false;
               }
           }
           
               int t = a[i];
               a[i] = a[min];
               a[min] = t;
            // System.out.print("Buoc "+(i+1)+": ");
            String s = "";
            for(int h = 0;h<n;h++){
                s += Integer.toString(a[h]);
                s += " ";
            }
            mys.push(s);
        }
        for (int i = n-1;i>=1;i--){
            System.out.print("Buoc "+i+": ");
            System.out.println(mys.peek());
            mys.pop();
        }
    }
}
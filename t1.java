import java.util.*;
public class t1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int dem = 1;
        while(t-->0){
            int n = sc.nextInt();
            long temp;
            HashMap<Long , Integer > hash = new HashMap<Long , Integer>();
            Long arr[] = new Long[n];
            Long set[] = new Long[n];
            int c = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(hash.containsKey(arr[i])){
                    hash.put(arr[i], hash.get(arr[i])+1);
                }
                else{
                    hash.put(arr[i],1);
                    set[c] = arr[i];
                    c++;
                }
            }
            System.out.println("Test " + dem +":");
            dem++;
            for(int i=0;i<c;i++){
                System.out.println(set[i] + " xuat hien " + hash.get(set[i]) + " lan");
            }
        }
//        HashMap<String, String> hashMap1 = new HashMap<String, String>();
    }
    
}
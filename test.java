import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for(int x=1 ; x<=t ; x++){
            int n= in.nextInt();
            int[] arr= new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]= in.nextInt();
            }
            System.out.println("Test "+x+":");
            sapxep(arr, n);
        }
    }
    public static void sapxep(int arr[], int n) {
        ArrayList<Integer> list1= new ArrayList<>();
        // ArrayList<Integer> list2= new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(list1.get(i)>0 ){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(list1.get(i).compareTo(list1.get(j)) == 0){
                    count++;
                    list1.set(j, 0);
                }
            }
                System.out.println(arr[i]+" xuat hien "+ count+ " lan");
            }
        }
    }
}
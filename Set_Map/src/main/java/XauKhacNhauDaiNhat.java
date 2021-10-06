/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equals(s2)){
                System.out.println(-1);
            }
            else{
                System.out.println(Math.max(s1.length(),s2.length()));
            }
        }
    }
}

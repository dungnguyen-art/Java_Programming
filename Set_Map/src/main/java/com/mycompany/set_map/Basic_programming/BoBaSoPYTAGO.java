/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.set_map.Basic_programming;

/**
 *
 * @author Admin
 */
import java.util.*;
public class BoBaSoPYTAGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                x = x*x;
                arr.add(x);
            }
            Collections.sort(arr);
            int flag = 1;
            for(int i=n-1;i>=2;i--){
                int l = 0;
                int r = n-2;
                while(l<r){
                    if(arr.get(l) + arr.get(r) < arr.get(i))
                        l++;
                    else if (arr.get(l) + arr.get(r) > arr.get(i))
                        r--;
                    else{
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

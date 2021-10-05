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
public class J01015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            int k = s.length();
            int flag = 1;
            for (int i=0;i<k;i++){
                if(s.charAt(i) != '0'&& s.charAt(i) != '1' && s.charAt(i) != '2'){
                    flag = 0;
                    break;
                }
            }
            
            if (flag == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

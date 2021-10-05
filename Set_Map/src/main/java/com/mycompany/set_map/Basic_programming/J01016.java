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
import java.util.Scanner;
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        int k =  s.length();
        for (int i=0;i<k;i++){
            if (s.charAt(i) == '4' || s.charAt(i) == '7')
                res += 1;
        }
        if (res == 7 || res == 4){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

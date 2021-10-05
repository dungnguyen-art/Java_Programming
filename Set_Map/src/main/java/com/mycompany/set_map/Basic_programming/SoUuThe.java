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

public class SoUuThe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            String s = sc.next();
            int c_odd = 0, c_even = 0;
            int flag = 1;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                int k = s.charAt(i) - '0';
                if (k >= 0 && k <= 9 && k % 2 == 0) {
                    c_even++;
                } else if (k >= 0 && k <= 9 && k % 2 == 1) {
                    c_odd++;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0 || s.charAt(0) == '0') {
                System.out.println("INVALID");
            } else {
                if (n % 2 == 0 && c_even > c_odd) {
                    System.out.println("YES");
                } else if (n % 2 == 1 && c_even < c_odd) {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}

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

public class LuaChonThamLam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int s_max = s;
        int[] a = new int[n + 1];
        // tìm min
        int flag = 1;
        if (s > n * 9 || s < 1) {
            flag = 0;
        } else {
            s -= 1;
            for (int i = n - 1; i > 0; i--) {
                if (s > 9) {
                    a[i] = 9;
                    s -= 9;
                } else {
                    a[i] = s;
                    s = 0;
                }
            }
            
            a[0] = 1+s;
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]);
            }
            System.out.print(" ");
        }
//        System.out.println(flag);
        // tìm max
        if (flag == 1) {
            for (int i = 0; i < n; i++) {
                if (s_max > 9) {
                    a[i] = 9;
                    s_max -= 9;
                } else {
                    a[i] = s_max;
                    s_max = 0;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]);
            }
        }
        if (flag == 0) {
            System.out.println("-1 -1");
        }
    }
}

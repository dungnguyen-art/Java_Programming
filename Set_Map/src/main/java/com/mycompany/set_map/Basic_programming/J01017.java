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

public class J01017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int flag = 0;
            String s = sc.next();
            int n = s.length();
            for (int i = 0; i < n - 1; i++) {
                int value = s.charAt(i)-s.charAt(i+1);
                if (Math.abs(value) != 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

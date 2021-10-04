/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.set_map.Basic_programming;

import java.util.Scanner;

/**S
 *
 * @author Admin
 */
public class J01018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += s.charAt(i) - '0';
            }
            int check = 1;
            int check_1 = 1;
            if (sum % 10 == 0) {
                check = 0;
            }
            for (int i = 0; i < n - 1; i++) {
                int k = s.charAt(i) - '0' - (s.charAt(i + 1) - '0');
                if (Math.abs(k) != 2) {
                    check_1 = 0;
                    break;
                }
            }
            if (check == 0 && check_1 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

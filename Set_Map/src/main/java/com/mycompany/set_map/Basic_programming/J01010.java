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

public class J01010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.next();
            int k = s.length();
//            System.out.println(s[1]);
            String res = "";
            int flag = 0;
            for (int i = 0; i < k; i++) {
                switch(s.charAt(i))
                {
                    case '0':
                        res += "0";
                        break;
                    case '8':
                        res += "0";
                        break;
                    case '9':
                        res += "0";
                        break;
                    case '1':
                        res += "1";
                        break;
                    default:
                        flag = 1;
                        break;
                }
            }
            long rs = Long.parseLong(res);
            if (flag == 1 || rs == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println(rs);
            }
        }
    }
}

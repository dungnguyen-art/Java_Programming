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

public class ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        int flag = 1;
        while (flag == 1) {
            int i = arr.size() - 1;
            flag = 0;
            while (i > 0) {
                int tmp = arr.get(i) + arr.get((i - 1));
                if (tmp % 2 == 0) {
                    arr.remove(i);
                    arr.remove(i - 1);
                    i -= 2;
                    flag = 1;
                } else {
                    i--;
                }
            }
            
            if(flag == 0){
                break;
            }
        }
        System.out.println(arr.size());
    }
}

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

public class DaoDau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                int x = -arr.get(i);
                sum += x;
            } else {
                sum += arr.get(i);
            }
        }
        System.out.println(sum);
    }
}

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
        // đổi dấu tất cả các số âm
        int j = 0;
        while (m-- > 0) {
            if (arr.get(j) < 0) {
                arr.set(j, -arr.get(j));
            } else {
                break;
            }
            j += 1;
        }
        Collections.sort(arr);
        // Nếu số lượt đổi còn lại là lẻ thì đổi dấu số nhỏ nhất.
        long sum = 0;
        if (m % 2 == 0) {
            arr.set(0, -arr.get(0));
        }
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        System.out.println(sum);
    }
}

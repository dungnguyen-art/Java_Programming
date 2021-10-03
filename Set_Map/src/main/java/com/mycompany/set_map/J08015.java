package com.mycompany.set_map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.HashMap;

public class J08015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];   //kich thuoc cua mang chi de int
            HashMap<Long, Integer> hm = new HashMap<>();    // tạo đối tượng hashmap
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                if (!hm.containsKey(arr[i])) {
                    hm.put(arr[i], 0);  // khởi tạo key arr[i] có value = 0
                }
                hm.put(arr[i], hm.get(arr[i]) + 1); //tăng value của key lên 1
            }
            long twice_count = 0;
            for (int i = 0; i < n; i++) {
                if (hm.get(k - arr[i]) != null) {   //tồn tại cặp số có tổng bằng k
                    twice_count += hm.get(k - arr[i]);  
                }
                if (k - arr[i] == arr[i]) {     // trừ chính số a[i] ra khỏi kết quả.
                    twice_count -= 1;
                }
            }
            System.out.println(twice_count / 2);
        }
    }
}

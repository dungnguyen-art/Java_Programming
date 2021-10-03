/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.set_map;

/**
 *
 * @author Admin
 */
import java.util.HashMap;
import java.util.Scanner;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        int tmp = n;
        while (n-->1){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(!hm.containsKey(a)){
                hm.put(a, 1);
            }
            else{
                hm.put(a, hm.get(a)+1);
            }
            if(!hm.containsKey(b)){
                hm.put(b, 1);
            }
            else{
                hm.put(b, hm.get(b)+1);
            }
        }
        int cnt_0 = 0,cnt_1 = 0;
        for (Integer i: hm.keySet()){
            if(hm.get(i) == 1){
                cnt_0 += 1;
            }
            else{
                cnt_1 += 1;
            }
        }
        if (cnt_0 + cnt_1 == tmp){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

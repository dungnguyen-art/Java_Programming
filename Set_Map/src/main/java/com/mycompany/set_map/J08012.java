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
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs_v = new HashSet<>();
        HashSet<Integer> hs_e = new HashSet<>();
        int n = sc.nextInt();
        int tmp = n;
        while (n-->1){
            int[] arr = new int[2];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            Arrays.sort(arr);
            hs_v.add(arr[0]);
            hs_e.add(arr[1]);
        }
        if(hs_v.size() == 1 && hs_e.size() == tmp-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

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
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        for (int i=0;i<n;i++){
            int x = Integer.parseInt(sc.next());
            arrA.add(x);
        }
        for (int i=0;i<m;i++){
            int x = Integer.parseInt(sc.next());
            arrB.add(x);
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(arrA);
        set.addAll(arrB);
        List<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        for (Integer i:list){
            System.out.print(i.toString()+" ");
        }
    }
}

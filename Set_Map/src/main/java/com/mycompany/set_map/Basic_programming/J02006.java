/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.set_map.Basic_programming;

import java.util.*;

/**
 *
 * @author Admin
 */
public class J02006 {
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
        arrA.retainAll(arrB);
        Collections.sort(arrA);
        for (Integer i:arrA){
            System.out.print(i.toString()+" ");
        }
    }
}

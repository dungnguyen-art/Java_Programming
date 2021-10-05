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

public class TapTuRiengHaiXau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            String[] s_1 = s.split(" ");
            List<String> listParts = Arrays.asList(s_1);
            HashSet<String> hs_1 = new HashSet<String>(listParts);        
             
            String[] s_2 = s1.split(" ");
            List<String> listParts_2 = Arrays.asList(s_2);
            HashSet<String> hs_2 = new HashSet<String>(listParts_2);
            
            for(String i:hs_1){
                if(hs_2.contains(i) == false){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}

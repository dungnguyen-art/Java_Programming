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
public class ChuanHoaXauHoTen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            // Loại bỏ khoảng trắng đầu và cuối String
            String s = sc.nextLine().toLowerCase().trim();
            String [] tmp = s.split("\\s+");
            String res = "";
            for(int i=1;i<tmp.length;i++){
                if(i==tmp.length-1)
                    res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1);
                else{
                    res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
                }
            }
            res += ", " +  tmp[0].toUpperCase();
            System.out.println(res);
        }
    }
}

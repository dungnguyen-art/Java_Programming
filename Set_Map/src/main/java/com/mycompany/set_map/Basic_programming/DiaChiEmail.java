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
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> hm = new HashMap<>();
        while(t-->0){
            String s = sc.nextLine().toLowerCase().trim();
            String [] tmp = s.split("\\s+");
            String res = "";
            res += tmp[tmp.length-1].substring(0);
            if(!hm.containsKey(res)){
                hm.put(res, 1);
            }
            else{
                hm.put(res,hm.get(res)+1);
            }
            
            String r = "";
            int flag = 1;
            if(hm.get(res) > 1){
                r += hm.get(res).toString();
                flag = 0;
            }
            for(int i=0;i<tmp.length-1;i++)
                res += tmp[i].substring(0,1);
            if(flag == 0){
                res += r;
            }
            res += "@ptit.edu.vn";
            System.out.println(res);
        }
    }
}

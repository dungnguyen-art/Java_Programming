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
public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        int flag = 1;
        while(flag == 1){
            flag = 0;
            int i = str.length()-1;
            while(i>0){
                if(str.charAt(i) == str.charAt(i-1)){
                    str.deleteCharAt(i);
                    str.deleteCharAt(i-1);
                    i -= 2;
                    flag = 1;
                }
                else{
                    i--;
                }
            }
            if(flag == 0)
                break;
        }
        if(str.length() > 0)
            System.out.println(str);
        else{
            System.out.println("Empty String");
        }
    }
}

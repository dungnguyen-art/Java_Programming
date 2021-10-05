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
public class ThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luong = sc.nextLong();
            int heso = Integer.parseInt(String.valueOf(ma.charAt(2))+String.valueOf(ma.charAt(3)));
            String ma_1 = String.valueOf(ma.charAt(0)) + String.valueOf(ma.charAt(1));
            long phucap = 0;
            if(ma_1.equals("HT"))
                phucap = 2000000;
            else if(ma_1.equals("HP"))
                phucap = 900000;
            else if(ma_1.equals("GV"))
                phucap = 500000;
            System.out.println(ma + " "+ ten + " " + String.valueOf(heso) + " " + String.valueOf(phucap)+ " " + String.valueOf(luong*heso+phucap));
            
    }
}

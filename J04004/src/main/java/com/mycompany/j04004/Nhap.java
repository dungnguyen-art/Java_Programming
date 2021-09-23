/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04004;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // khỏi tạo một đối tượng tên ps1, ps2 từ một lớp J04004
        J04004 ps1=new J04004(in.nextLong(),in.nextLong()); 
        J04004 ps2=new J04004(in.nextLong(),in.nextLong());
        ps1.congPhanSo(ps2);
    }
}

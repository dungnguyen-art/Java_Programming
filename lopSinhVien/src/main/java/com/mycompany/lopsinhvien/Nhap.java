/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lopsinhvien;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        lopSinhVien lsv = new lopSinhVien(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        lsv.result();
    }
}

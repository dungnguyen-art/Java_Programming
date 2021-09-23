/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ps1;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(sc.nextLong(),sc.nextLong());
        ps1.rutGon();
    }
}

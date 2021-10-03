package com.mycompany.j04006;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin //
 */
//import com.mycompany.j04006.J04006;
import java.util.*;

public class Khai_Bao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String name = sc.nextLine();
            String cls = sc.nextLine();
            String date = sc.nextLine();
            Float degree = sc.nextFloat();

            Sinh_Vien sv = new Sinh_Vien(name, cls, date, degree);
            sv.result();
        }
    }
}

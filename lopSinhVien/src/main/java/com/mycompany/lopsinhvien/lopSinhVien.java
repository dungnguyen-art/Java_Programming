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
public class lopSinhVien {
    String name, date;
    Float degree_1, degree_2, degree_3;
    public lopSinhVien(String name,String date,Float degree_1,Float degree_2,Float degree_3) {
        this.name = name;
        this.date = date;
        this.degree_1 = degree_1;
        this.degree_2 = degree_2;
        this.degree_3 = degree_3;
    }
    public void result(){
        Float sum = this.degree_1+this.degree_2+this.degree_3;
        System.out.print(this.name + " " + this.date + " " + sum);
    }
}

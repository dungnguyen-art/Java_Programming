package com.mycompany.j04006;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class Sinh_Vien {
    private String name,cls,date;
    private Float degree;
    public Sinh_Vien(String name, String cls,String date, Float degree){
        this.name = name;
        this.cls = cls;
        this.date = date;
        this.degree = degree;
    }
    public void result(){
        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
            Date d = dt.parse(date);
            date = dt.format(d);
        } catch(Exception e) {
            e.printStackTrace();
        }
         String degre = String.format("%.2f", this.degree);
//        Date date = formatter.format(this.date);
        System.out.print("B20DCCN001 " + this.name + " " +this.cls + " " + date+" " + degre);
        System.out.println("\n");
    }
    
}

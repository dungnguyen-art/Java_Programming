/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04002;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String clr = sc.next();
        if (w <= 0 || h <= 0){
            System.out.println("INVALID");
        }
        else{
            j04002 RTG = new j04002(w,h,clr);
            System.out.println((int)RTG.Perimeter() + " " + (int)RTG.Area()+ " " + RTG.reColor());
        }
    }
}

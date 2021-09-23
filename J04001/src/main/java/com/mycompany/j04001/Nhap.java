/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04001;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            J04001 P1 = new J04001();
            J04001 P2 = new J04001();
            P1.setX(sc.nextDouble());
            P1.setY(sc.nextDouble());
            P2.setX(sc.nextDouble());
            P2.setY(sc.nextDouble());
//            sc.nextLine();
            double res = P1.distance(P2);
            String s = String.format("%.4f",res);
            System.out.println(s);
        }
    }
}

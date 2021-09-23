package com.mycompany.j04006;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
// */
//import com.mycompany.j04006.J04006;
import java.util.*;
public class Nhap {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        J04006 tmp = new J04006(in.nextLine(),in.nextLine(),in.nextLine(),in.nextFloat());
        tmp.result();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04007;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Nhap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        J04007 tmp = new J04007(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine() );
        tmp.result();
    }
}

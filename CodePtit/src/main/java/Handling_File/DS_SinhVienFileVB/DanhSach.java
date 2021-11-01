/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handling_File.DS_SinhVienFileVB;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;
public class DanhSach {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("SINHVIEN.in");
        Scanner input = new Scanner(myFile);
        int test = Integer.parseInt(input.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=1;i<=test;i++){
            String ten = input.nextLine();
            String lop = input.nextLine();
            String ngSinh = input.nextLine();
            float gpa = Float.parseFloat(input.nextLine());
            SinhVien sv = new SinhVien(i,ten,lop,ngSinh,gpa);
            arr.add(sv);
        }
        for(SinhVien i: arr){
            System.out.println(i.toString());
        }
    }
}

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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SinhVien {
    private int id;
    private String ten, lop, ngSinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngSinh, float gpa) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.ngSinh = ngSinh;
        this.gpa = gpa;
    }

    public String getTen() {
        String[] tmp = ten.toLowerCase().split("\\s+");
        String res = "";
        for(int i=0;i<tmp.length;i++){
            String s1 = tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1);
            res += s1 + " ";
        }
        return res;
    }
    

    public String getId() {
        String res = "";
        if(id >= 10){
            res += "B20DCCN0" + String.valueOf(id);
        }
        else{
            res += "B20DCCN00" + String.valueOf(id);
        }
        return res;
    }

    public String getNgSinh(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = formater.parse(ngSinh);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dob = formater.format(date);
        return dob;
    }

    public String getGpa() {
        String res = String.valueOf(gpa);
        if(res.length()== 3){
            res += "0";
        }
        return res;
    }

    @Override
    public String toString() {
        return getId() + " " + getTen() + lop + " " + getNgSinh() + " " + getGpa();
    }
    
    
}

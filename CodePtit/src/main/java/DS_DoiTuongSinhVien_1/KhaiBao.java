/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_DoiTuongSinhVien_1;


import java.util.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


class DS_DoiTuongSinhVien_1 {

    private int ma;
    private String ten, mcls, ngSinh;
    private float gpa;

    public DS_DoiTuongSinhVien_1() {
    }

    
    
    public DS_DoiTuongSinhVien_1(int ma, String ten, String mcls, String ngSinh, float gpa) {
        this.ma = ma;
        this.ten = ten;
        this.mcls = mcls;
        this.ngSinh = ngSinh;
        this.gpa = gpa;
    }

    public String FormatMA(int ma) {
        String tmp;
        if (ma < 10) {
            tmp = "00" + String.valueOf(ma);
        } else {
            tmp = "0" + String.valueOf(ma);
        }
        String res = "B20DCCN" + tmp;
        return res;
    }

    public String FormatNGSINH(String ngSinh) {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        String d = null;
        try {
            date = formatter.parse(ngSinh);
            d = formatter.format(date);
        } catch (ParseException ex) {
            Logger.getLogger(DS_DoiTuongSinhVien_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
    public String FormatGPA(float gpa){
        String g = String.valueOf(gpa);
        if(g.length() == 3){
            g += "0";
        }
        return g;
    }
    public void thongBao() throws ParseException {
        String res = FormatMA(ma) + " " + ten + " " + mcls + " " + FormatNGSINH(ngSinh) + " " + FormatGPA(gpa);
        System.out.println(res);
    }
}

public class KhaiBao {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String mcls = sc.nextLine();
            String ngSinh = sc.nextLine();
            Float gpa = Float.parseFloat(sc.nextLine());
            DS_DoiTuongSinhVien_1 sv = new DS_DoiTuongSinhVien_1(i, ten, mcls, ngSinh, gpa);
            sv.thongBao();
        }
    }
}

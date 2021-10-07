/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_DoiTuongSinhVien_1;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.SimpleDateFormat;

public class DS_DoiTuongSinhVien_1 {

    private int ma;
    private String ten, mcls, ngSinh;
    private float gpa;

    public DS_DoiTuongSinhVien_1(int ma, String ten, String mcls, String ngSinh, float gpa) {
        this.ma = ma;
        this.ten = ten;
        this.mcls = mcls;
        this.ngSinh = ngSinh;
        this.gpa = gpa;
    }

    public String FormatMA(int ma) {
        String res = "B20DCCN00" + String.valueOf(ma);
        return res;
    }

    public String FormatNGSINH(String ngSinh) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse(ngSinh);
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            String d = formatter1.format(date);
            return d;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void thongBao() {
        String res = FormatMA(ma) + " " + ten + " " + mcls + " " + FormatNGSINH(ngSinh) + " " + String.valueOf(gpa);
        System.out.println(res);
    }
}

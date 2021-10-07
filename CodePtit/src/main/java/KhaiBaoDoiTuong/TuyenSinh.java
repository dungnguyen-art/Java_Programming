/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhaiBaoDoiTuong;

/**
 *
 * @author Admin
 */
public class TuyenSinh {
    // tạo thuộc tính cho lớp
    private String ma,ten;
    private float toan,ly, hoa;
    // Contructor được dùng để khởi tạo đối tượng.
    public TuyenSinh(String ma,String ten,float toan, float ly, float hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public float tinhTong(float toan,float ly,float hoa){   //method tinh tong
        float sm = toan*2+ly+hoa;
        return sm;
    }
    public float uuTien(String ma){    // method tinh uu tien
        if(ma.charAt(2) == '1'){
            return (float) 0.5;
        }
        else if(ma.charAt(2) == '2'){
            return (float) 1.0;
        }
        else{
            return (float) 2.5;
        }
    }
    public String ketQua(){         // method ket luan
        float diem = tinhTong(toan, ly, hoa) + uuTien(ma);
        if(diem >= 24){
            return "TRUNG TUYEN";
        }
        else{
            return "TRUOT";
        }
    }
    public void thongBao(){
        String r = String.valueOf(tinhTong(toan, ly, hoa));
        String r_1,u_1;
        int k = r.indexOf('.');
        if(r.charAt(k+1) == '0'){
            r_1 = r.replace(".0", "");
        }
        else{
            r_1 = r;
        }
        String u = String.valueOf(uuTien(ma));
        int k_1 = u.indexOf('.');
        if(u.charAt(k_1+1) == '0'){
            u_1 = u.replace(".0", "");
        }
        else{
            u_1 = u;
        }
        String res = ma + " " + ten + " " + u_1 + " " + r_1 + " "+ ketQua(); 
        System.out.println(res);
    }
    
}

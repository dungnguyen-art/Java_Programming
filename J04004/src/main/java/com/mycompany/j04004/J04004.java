/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04004;

/**
 *
 * @author Admin
 */
public class J04004 {
    // thuộc tính dạng private chỉ được dùng bên trong lớp này.
    private long tu, mau;
    //hàm tạo trong java cho đối tượng ps1, ps2 sử dụng.
    public J04004(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    // phương thức public cho đối tượng -->phải khởi tạo một đối tượng mới có thể truy cập được.
    // phương thức static --> được phép truy cập mà không cần tạo một đối tượng
    public long getTu() {
        return tu;
    }
 
    public void setTu(long tu) {
        this.tu = tu;
    }
 
    public long getMau() {
        return mau;
    }
 
    public void setMau(long mau) {
        this.mau = mau;
    }
 
    public long timUSCLN(long a, long b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void toiGianPhanSo() {
        long i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    // tạo một đối tượng ps từ lớp J04004
    public void congPhanSo(J04004 ps) {
        long ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        long ms = this.getMau() * ps.getMau();
        J04004 phanSoTong = new J04004(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println(phanSoTong.tu + "/" + phanSoTong.mau);
    }
    
}

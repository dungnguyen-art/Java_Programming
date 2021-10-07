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
import java.util.*;

public class KhaiBao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        TuyenSinh ts = new TuyenSinh(ma,ten,toan,ly,hoa);
        ts.thongBao();
    }
}

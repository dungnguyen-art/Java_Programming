/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_DoiTuongSinhVien_1;

import java.util.*;

/**
 *
 * @author Admin
 */
public class KhaiBao {

    public static void main(String[] args) {
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

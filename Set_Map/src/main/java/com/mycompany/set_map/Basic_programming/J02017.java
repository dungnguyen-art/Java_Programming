/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.set_map.Basic_programming;

/**
 *
 * @author Admin
 */
import java.util.*;

public class J02017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(sc.nextLine());
            arr.add(x);
        }
        int flag = 1;
        Iterator itr = arr.iterator();
        while (itr.hasNext()) { // giữ truy khi còn lại một phần tử duy nhất vẫn còn trong 
            flag = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (Integer.sum(arr.get(i), arr.get(i + 1)) % 2 == 0) {
                    itr.remove(arr.get(i));
                    itr.remove(i+1)
                    flag = 1;
                }
            }
            if (flag == 1) {
            } else {
                flag = 0;
                break;
            }
        }
        System.out.println(arr.size());
    }
}

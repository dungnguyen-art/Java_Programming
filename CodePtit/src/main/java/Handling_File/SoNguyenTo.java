/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handling_File;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;

public class SoNguyenTo {

    public static boolean isPrime(int n) {
        if(n<2)
             return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        Collections.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer i : arr) {
            if (isPrime(i) == true) {
                if (!hm.containsKey(i)) {
                    hm.put(i, 1);
                } else {
                    hm.put(i, hm.get(i) + 1);
                }
            }
        }
        for (Integer i : hm.keySet()) {
            System.out.printf("%d %d\n", i, hm.get(i));
        }
    }
}

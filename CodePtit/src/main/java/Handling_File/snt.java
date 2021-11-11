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
public class snt {
    public static int check(int n){
        if(n<2){
            return 0;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream din1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> ts1 = new TreeSet<>();
        ArrayList<Integer> arr = (ArrayList<Integer>) din.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) din1.readObject();
        
        for(Integer i : arr){
            if(check(i)== 1){
                ts.add(i);
            }
        }
        
        for(Integer i : arr2){
            if(check(i) == 1){
                ts1.add(i);
            }
        }
        
        for(Integer i: ts){
            long tmp = 1000000 - i;
            if(ts1.contains(tmp) && i < tmp){
                System.out.println(i + " " + tmp);
            }
        }
    }
}
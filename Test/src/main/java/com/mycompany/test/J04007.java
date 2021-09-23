package com.mycompany.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J04007 {
    String name, gender, date, address,code,contract;
    public J04007(String name, String gender, String date, String address, String code, String contract){
      this.name = name;
      this.gender = gender;
      this.date = date;
      this.address = address;
      this.code = code;
      this.contract = contract;
    }
    public void result(){
//         try {
//            SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
//            Date d = dt.parse(date);
//            date = dt.format(d);
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//        try{
//            SimpleDateFormat dt_1 = new SimpleDateFormat("dd/mm/yyyy");
//            Date c = dt_1.parse(contract);
//            contract = dt_1.format(c);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("00001 " + this.name + " " + this.gender + " " + this.date + " " + this.address + " " + this.code + " " + this.contract );
    }
}

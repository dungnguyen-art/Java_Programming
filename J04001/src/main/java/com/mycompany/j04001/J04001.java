/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04001;

/**
 *
 * @author Admin
 */
public class J04001 {
    private double x,y;
    public J04001(){
    }
    public J04001(double x, double y){
        this.x = x;
        this.y = y;
    }
    // hàm tạo sao chép.
    public J04001(J04001 p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    // taoj hamf sao chep secondpoint
    public double distance(J04001 secondPoint){
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        double dis = Math.sqrt((d1*d1)+(d2*d2));
        return dis;
    }
    public double distance(J04001 p1, J04001 p2){
        double d1 = p1.x - p2.x;
        double d2 = p1.y - p2.y;
        double dis = Math.sqrt((d1*d1) + (d2*d2));
        return dis;
    }
}

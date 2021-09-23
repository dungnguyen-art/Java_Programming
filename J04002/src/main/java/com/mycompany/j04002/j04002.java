/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j04002;

/**
 *
 * @author Admin
 */
public class j04002 {

    private double w, h;
    private String clr;

    // hàm tạo cho đối tượng sử dụng
    public j04002() {
        this.w = 1;
        this.h = 1;
    }

    public j04002(double w, double h, String clr) {
        this.w = w;
        this.h = h;
        this.clr = clr;
    }

    public double getWidth() {
        return w;
    }

    public void setWidth(double w) {
        this.w = w;
    }

    public double getHeight() {
        return h;
    }

    public void setHeight(double w) {
        this.h = h;
    }

    public String getColor() {
        return clr;
    }

    public void setColor(String clr) {
        this.clr = clr;
    }

    public double Area() {
        return w * h;
    }

    public double Perimeter() {
        return (w + h) * 2;
    }

    public String reColor() {
        String cap = clr.substring(0, 1).toUpperCase() + clr.substring(1).toLowerCase();
        return cap;
    }
}

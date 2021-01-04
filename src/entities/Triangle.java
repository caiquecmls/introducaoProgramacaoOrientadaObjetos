/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author caiqu
 */
public class Triangle {

    public double a;
    public double b;
    public double c;

//    double p = (x.a + x.b + x.c) / 2;
//    double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
    
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Program1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf("Triangle x area: %.4f%n", areaY);
        
        if(areaX > areaY){
            System.out.println("Larger area: X"); 
        }else{
            System.out.println("Larger area: Y");
        }
    }
}

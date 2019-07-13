/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Class3 {

    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius ");
        radius = in.nextDouble();

        if (radius > 0) {
            diameter = 2.0 * radius;
            circumference = 2.0 * Math.PI * radius;
            area = Math.PI * radius * radius;
            System.out.println("Diameter is " + diameter);
            System.out.println("Circumference is " + circumference);
            System.out.println("Area is " + area);
        } else {
            System.out.println("Error");
        }
    }

}

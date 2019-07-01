/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Btvn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        double delta;
        double x1, x2;
        double x;
        System.out.println("ax^2 + bx + c = 0 ");
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = in.nextInt();
        System.out.print("Nhap b: ");
        b = in.nextInt();
        System.out.print("Nhap c: ");
        c = in.nextInt();
        delta = b * b - 4.0 * a * c;

        if (delta > 0.0) {

            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.print("x1 = " + x1 + "\nx2 = " + x2);

        } else if (delta == 0.0) {

            x = -b / (2.0 * a);
            System.out.print("x = " + x);

        } else {
            System.out.print("Pt vo nghiem");
        }

    }

}

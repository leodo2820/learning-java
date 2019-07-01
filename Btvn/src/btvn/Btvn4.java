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
public class Btvn4 {

    public static void main(String[] args) {
        int a, b, ucln, bcnn, i1, i2;
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap so a ");
        a = in.nextInt();
        System.out.print("Nhap so b ");
        b = in.nextInt();

        while (a <= 0 || b <= 0) {
            System.out.print("Nhap lai 2 so a va b ");
            System.out.print("Nhap so a ");
            a = in.nextInt();
            System.out.print("Nhap vao so b ");
            b = in.nextInt();
        }
        i1 = a;
        i2 = b;
        while (i1 != i2) {
            if (i1 > i2) {
                i1 = i1 - i2;
            } else {
                i2 = i2 - i1;
            }
        }
        ucln = i1;

        System.out.print("UCLN cua " + a + " va " + b + " la " + ucln);
        System.out.println("\nBCNN cua " + a + " va " + b + " la " + ((a*b)/ucln));

    }

}

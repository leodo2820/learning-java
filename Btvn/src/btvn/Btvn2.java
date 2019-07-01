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
public class Btvn2 {

    public static void main(String[] args) {
        int giaiThua = 1;
        int n, i;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n ");
        n = in.nextInt();
        for (i = 1; i <= n; ++i) {
            giaiThua = giaiThua * i;
        }
        System.out.println("Giai thua cua " + n + " la " + giaiThua);

    }
}

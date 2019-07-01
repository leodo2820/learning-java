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
public class Btvn5 {

    public static void main(String[] args) {
        int i, n, max, min;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        max = Math.max(1, n);
        System.out.println("\nSo lon nhat la "+max);
        min = Math.min(1, n);
        System.out.println("So nho nhat la "+min);
    }

}

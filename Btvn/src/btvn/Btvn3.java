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
public class Btvn3 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int n;
        int count;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so ");
        count = in.nextInt();
        System.out.print(n1+" "+n2);
        for (n = 2; n < count; ++n) {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        } 
    }
}

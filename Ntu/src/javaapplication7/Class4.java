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
public class Class4 {

    public static void main(String[] args) {
        int a, b, temp;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        a = in.nextInt();
        System.out.print("Enter the second integer: ");
        b = in.nextInt();

        temp = a;
        a = b;
        b = temp;
        System.out.println("After the swap, first integer is: "+a+", second integer is: "+b);
    }

}

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
public class Class2 {

    public static void main(String[] args) {
        int a, b, c;
        int sum, product, min, max;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first integer ");
        a = in.nextInt();
        System.out.print("Enter the second integer ");
        b = in.nextInt();
        System.out.print("Enter the third integer ");
        c = in.nextInt();

        sum = a + b + c;
        product = a * b * c;
        System.out.print("Sum of "+a+", "+b+", "+c+" is "+sum);
        System.out.println("\nProduct of "+a+", "+b+", "+c+" is "+product);

        min = a;
        if (b < a) {
            min = b;
        }
        if (c < a) {
            min = c;
        } System.out.println("Min is "+min);
        
        max = a;
        if(b>a){
            max = b;
        }
        if(c>a){
            max = c;
        } System.out.println("Max is "+max);
    } 

}

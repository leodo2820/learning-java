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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first integer ");
        a = in.nextInt();
        System.out.print("Enter the second integer ");
        b = in.nextInt();
        
        sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);

        // TODO code application logic here
    }

}

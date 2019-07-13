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
public class Class6 {

    public static void main(String[] args) {
        int SENTINAL = -1;
        double TAX_RATE_ABOVE_20K = 0.1;
        double TAX_RATE_ABOVE_40K = 0.2;
        double TAX_RATE_ABOVE_60K = 0.3;
        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the taxable income( or -1 to end): $");
        taxableIncome = in.nextInt();

        while (taxableIncome != SENTINAL) {
            if (taxableIncome <= 20000) {
                taxPayable = 0.00;
                System.out.println("The income taxable is: $" + taxPayable);
            } else if (taxableIncome <= 40000) {
                taxPayable = taxableIncome * TAX_RATE_ABOVE_20K;
                System.out.println("The income taxable is: $" + taxPayable);
            } else if (taxableIncome <= 60000) {
                taxPayable = taxableIncome * TAX_RATE_ABOVE_40K;
                System.out.println("The income taxable is: $" + taxPayable);
            } else {
                taxPayable = taxableIncome * TAX_RATE_ABOVE_60K;
                System.out.println("The income taxable is: $" + taxPayable);
            }
            System.out.print("Enter the taxable income( or -1 to end): $");
            taxableIncome = in.nextInt();
        }
        System.out.println("Bye");

    }
}

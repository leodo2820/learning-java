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
public class Class5 {

    public static void main(String[] args) {
        int taxableIncome;
        double taxPayable;
        double TAX_RATE_ABOVE_20K = 0.1;
        double TAX_RATE_ABOVE_40K = 0.2;
        double TAX_RATE_ABOVE_60K = 0.3;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the taxable income: ");
        taxableIncome = in.nextInt();

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
    }
}

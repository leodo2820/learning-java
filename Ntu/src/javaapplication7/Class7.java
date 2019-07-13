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
public class Class7 {

    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        int salary, age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the monthly salary: $");
        salary = in.nextInt();
        System.out.print("Enter the age: ");
        age = in.nextInt();

        contributableSalary = 6000;

        if (age <= 55) {
            employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
            totalContribution = employeeContribution + employerContribution;
            System.out.println("The employee's contribution is: $" + employeeContribution);
            System.out.println("The employer's contribution is: $" + employerContribution);
            System.out.println("The total contribution is: $" + totalContribution);
        } else if (age <= 60) {
            employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = salary * EMPLOYER_RATE_55_TO_60;
            totalContribution = employeeContribution + employerContribution;
            System.out.println("The employee's contribution is: $" + employeeContribution);
            System.out.println("The employer's contribution is: $" + employerContribution);
            System.out.println("The total contribution is: $" + totalContribution);
        } else if(age<=65){
            employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = salary * EMPLOYER_RATE_60_TO_65;
            totalContribution = employeeContribution + employerContribution;
            System.out.println("The employee's contribution is: $" + employeeContribution);
            System.out.println("The employer's contribution is: $" + employerContribution);
            System.out.println("The total contribution is: $" + totalContribution);
        } else {
            employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
            totalContribution = employeeContribution + employerContribution;
            System.out.println("The employee's contribution is: $" + employeeContribution);
            System.out.println("The employer's contribution is: $" + employerContribution);
            System.out.println("The total contribution is: $" + totalContribution);
        }

    }

}

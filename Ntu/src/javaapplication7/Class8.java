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
public class Class8 {

    public static void main(String[] args) {
        String truePassword = "hailong";
        String password;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the password: ");
        password = in.nextLine();

        while (!password.equals(truePassword)) {
            System.out.print("Enter the password: ");
            password = in.nextLine();
        }
        System.out.print("Success");
        

    }
}

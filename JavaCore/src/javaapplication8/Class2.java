/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Class2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        //fill an array with number 1,2,3,...,n
        int[] numbers = new int[n]; //fill an array with number 1,2,3,...,n
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        //draw k numbers and put them into a second array
        int[] results = new int[k];
        for (int i = 0; i < results.length; i++) {
            //make a random index between 1 and n-1
            int r = (int) (Math.random() * n);
            //pick the element at the random location
            results[i] = numbers[r];
            //move the last element into random location
            numbers[r] = numbers[n - 1];
            n--;
        }
        //print the sorted array
        Arrays.sort(results);
        System.out.println("Bet the following combination. It'll make you rich! ");
        for (int r : results) {
            System.out.println(r);
        }
    }

}

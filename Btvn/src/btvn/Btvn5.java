/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Btvn5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap vao phan tu thu " + i + "; ");
            numbers[i] = in.nextInt();
        }
        System.out.println("Day so nguoi dung vua nhap la ");
        for (int i : numbers) {
            System.out.print(i + "\t");
        }
//        Arrays.sort(numbers);
//        System.out.println("\nMin la "+numbers[0]);
//        System.out.println("Max la "+numbers[n-1]);
        int min = numbers[0];
        int max = numbers[0];
        for(int i :numbers){
            if(i>max){
                max = i;
            }
            else if(i<min){
                min = i;
            }
        } 
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
       
    }

}

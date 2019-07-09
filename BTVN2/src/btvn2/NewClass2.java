/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NewClass2 {

    public static final char BIT_ONE = '1';
    public static final char BIT_ZERO = '0';

    public static void main(String[] args) {
        int count = 0;//so chu so cua dang nhi phan
        int p = 0;//so so 1 lien nhau ban dau
        int m = 0;//so so 0
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = in.nextInt();

        if (n < 6) {
            System.out.println("Khong phai so hoan thien");
        }
        String str = Integer.toBinaryString(n);//bien n thanh dang nhi phan
        String subStr = str.substring(str.indexOf("1"));//cat so 0 o dau cua dang nhi phan cho den so 1 dau tien

        while (count < subStr.length() && subStr.charAt(count) == BIT_ONE)//dem so so 1 cho den so 0 dau tien
        {
            p++;
            count++;
        }
        while (count < subStr.length())//dem so so 0
        {
            if (subStr.charAt(count) == BIT_ZERO) {
                m++;
            }
            count++;
        }

    }

}



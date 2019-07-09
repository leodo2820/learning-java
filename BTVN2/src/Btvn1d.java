/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy số gồm n số tự nhiên Tính tổng các số nguyên tố
 *
 * @author leodo0208
 */
public class Btvn1d {

    public static void main(String[] args) {
        int sum = 0;
        boolean check = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap chu so thu " + i + ": ");
            numbers[i] = in.nextInt();
            for (int j = 2; j < Math.sqrt(numbers[i]); j++) {
                if (numbers[i] % j == 0 && numbers[i] < 2) {
                    check = false;
                }
            }
            if (check) {
                sum += numbers[i];
            }
        }

        System.out.print("Day so vua nhap la: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nTong cua cac so nguyen to la: " + sum);
    }

}

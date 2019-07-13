/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy số gồm n số tự nhiên. Tìm vị trí phần tử chẵn cuối cùng
 *
 * @author leodo0208
 */
public class Btvn1f {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap vao so thu " + i + ": ");
            numbers[i] = in.nextInt();
        }
        System.out.print("Day so vua nhap la: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        for (int i : numbers) {
            if (i % 2 != 0) {
                continue;                
            }
            System.out.println("\nSo chan cuoi cung cua day la: "+i);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy số gồm n số tự nhiên. Tìm vị trí phần tử lớn nhất đầu tiên có
 * trong mảng
 *
 * @author leodo0208
 */
public class Btvn1g {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            numbers[i] = in.nextInt();
        }
        System.out.print("Day so vua nhap la: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }

        }
        System.out.println("\nPhan tu lon nhat co gia tri la: " + max);
        System.out.println("Vi tri cua phan tu lon nhat dau tien la: " + index);
    }
}

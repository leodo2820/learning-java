/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy gồm n số tự nhiên, liệt kê tần suất xuất hiện của mỗi phần tử
 *
 * @author leodo0208
 */
public class OnTap6 {

    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
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
        System.out.print("\nNhap vao mot so nguyen bat ki: ");
        int m = in.nextInt();
        //Dem so lan xuat hien cua so nguyen do trong day so tren
        for (int i = 0; i < n; i++) {
            if (numbers[i] == m) {
                count++;
            }
        }
        System.out.println("So phan tu " + m + " co trong mang la: " + count);
    }
}

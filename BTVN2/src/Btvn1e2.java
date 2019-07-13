/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy số gồm n số tự nhiên Tìm vị trí phần tử lẻ đầu tiên Dùng break
 * Dùng break
 * @author leodo0208
 */
public class Btvn1e2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            numbers[i] = in.nextInt();
        }
        System.out.print("Day so da nhap la: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        for (int i : numbers) {
            if (i % 2 != 0) {
                System.out.println("\nSo le dau tien cua day la: " + i);
                break;
            }
        }
        System.out.println("\nKhong co so le trong day");
    }
}


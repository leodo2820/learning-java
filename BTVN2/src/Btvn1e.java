/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào dãy số gồm n số tự nhiên Tìm vị trí phần tử lẻ đầu tiên
 * Không dùng break
 * @author leodo0208
 */
public class Btvn1e {

    public static void main(String[] args) {
        boolean check = true;
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
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && check) {
                System.out.print("\nSo le dau tien cua mang la: " + numbers[i]);
                check = false;
            }

        }
        if (check) {
            System.out.print("\nKhong co so le ");
        }

    }
}

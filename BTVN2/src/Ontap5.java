/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước
 *
 * @author leodo0208
 */
public class Ontap5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();

        System.out.print("Cac so nguyen to nho hon n la: ");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (check(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

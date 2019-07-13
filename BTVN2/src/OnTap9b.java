/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
 * b) Liệt kê các ước số là nguyên tố của n.
 *
 * @author leodo0208
 */
public class OnTap9b {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        System.out.print("Cac uoc so la so nguyen to cua n la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && check(i)) {
                System.out.print(" " + i);
            }
        }

    }

    public static boolean check(int n) {
        double sqrt = Math.sqrt(n);
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

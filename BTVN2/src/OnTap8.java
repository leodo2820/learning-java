/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập một số tự nhiên n. Hãy liệt kê các số Fibonaci nhỏ hơn n là số nguyên
 * tố.
 *
 * @author leodo0208
 */
public class OnTap8 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        while (c < n) {
            if (check(c)) {
                System.out.print(" " + c);
            }
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        double sqrt = Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

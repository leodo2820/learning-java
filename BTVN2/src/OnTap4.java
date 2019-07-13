/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố vd: Số
 * 28 được phân tích thành 2 x 2 x 7
 *
 * @author leodo0208
 */
public class OnTap4 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        n = in.nextInt();

        int m = n;
        boolean check = true;
        for (int i = 2; i <= n; i++) {
            while (m % i == 0) {
                if (check) {
                    System.out.println(i);
                    check = false;
                } else {
                    System.out.print(" x " + i);
                }
                m /= i;
            }
        }
    }
}

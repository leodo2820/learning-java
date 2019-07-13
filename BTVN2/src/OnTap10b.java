/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
 * b) Liệt kê n số Fibonaci đầu tiên
 *
 * @author leodo0208
 */
public class OnTap10b {

    public static void main(String[] args) {
        int i1 = 0;
        int i2 = 1;
        int i3;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();

        System.out.print(n + " so Fibonacci la: "+i1+" "+i2);
        for (int i = 2; i < n; i++) {
            i3 = i1 + i2;
            System.out.print(" " + i3);
            i1 = i2;
            i2 = i3;
        }
    }
}

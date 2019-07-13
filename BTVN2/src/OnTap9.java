/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
 * a) Liệt kê các ước số của n. Có bao nhiêu ước số.
 *
 * @author leodo0208
 */
public class OnTap9 {

    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();
        
        System.out.print("Uoc so cua n la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" "+ i);
                count++;
            }
        }
        System.out.println("\nSo uoc so cua " + n + " la: " + count);
    }
}

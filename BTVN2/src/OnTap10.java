/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
 * a) Liệt kê n số nguyên tố đầu tiên.
 *
 * @author leodo0208
 */
public class OnTap10 {

    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();
        
        System.out.print(n+" so nguyen to dau tien la: ");
        while (count < n) {
            if (check(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
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

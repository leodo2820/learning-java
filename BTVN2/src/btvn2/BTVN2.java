/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BTVN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = in.nextInt();

        if (n < 2) {
            System.out.print("Khong co so nguyen to");
        }

        /*một số nguyên >= 2 bất kỳ sẽ luôn có số ước ở nửa đầu căn bậc 2 của nó bằng số ước ở nửa sau căn bậc 2 của nó.
        Đếm số ước của x trong đoạn từ 2 đến căn bậc hai của x. Nếu số đó không có ước nào trong đoạn từ 2 đến căn bậc hai của x thì nó là số nguyên tố.
         */
        boolean check = true;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                
            }

        }
        if (check) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong la so nguyen to");
        }
        

    }
}

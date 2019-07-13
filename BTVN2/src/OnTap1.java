/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào năm bất kỳ, kiểm tra năm có phải là năm nhuận
 *
 * @author leodo0208
 */
public class OnTap1 {

    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Nhap so nam: ");
            year = in.nextInt();
        } while (year < 0);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Nam do la nam nhuan");
                } else {
                    System.out.print("Nam do la nam khong nhuan");
                }
            } else {
                System.out.print("Nam do la nam nhuan");
            }
        } else {
            System.out.print("Nam do la nam khong nhuan");
        }
    }
}

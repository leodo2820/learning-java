/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số
 * 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
 *
 * @author leodo0208
 */
public class OnTap3 {

    public static void main(String[] args) {
        int n, soDu;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        n = in.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
        }
        System.out.println("Tong cua cac chu so la: " + sum);
    }

}

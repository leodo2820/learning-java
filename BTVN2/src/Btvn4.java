/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Trong mặt phằng tọa độ Oxy, tính chu vi và diện tích tam giác ABC với tọa độ
 * các điểm nhập từ bàn phím
 *
 * @author leodo0208
 */
public class Btvn4 {

    public static void main(String[] args) {
        double chuVi, dienTich;
        Scanner in = new Scanner(System.in);

        int[] canh = new int[3];
        do {
            System.out.print("Nhap canh a: ");
            canh[0] = in.nextInt();
            System.out.print("Nhap canh b: ");
            canh[1] = in.nextInt();
            System.out.print("Nhap canh c: ");
            canh[2] = in.nextInt();
        } while (canh[0] < 0 || canh[1] < 0 || canh[2] < 0);

        chuVi = (canh[0] + canh[1] + canh[2]) / 2.0;
        dienTich = Math.sqrt(chuVi * (chuVi - canh[0]) * (chuVi - canh[1]) * (chuVi - canh[2]));
        System.out.println("Chu vi tam giac la: " + chuVi * 2);
        System.out.println("Dien tich tam giac la: " + dienTich);
    }
}

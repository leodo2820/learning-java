/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Viết chương trình chuyển số tự nhiên n (hệ cơ số 10) thành số ở hệ cơ số 2, 8
 * và 16
 *
 * @author leodo0208
 */
public class OnTap2 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        n = in.nextInt();
        //chuyen doi sang co so 2
        String str1 = Integer.toBinaryString(n);
        System.out.println("He nhi phan cua "+n+" la: "+str1);
        //chuyen doi sang co so 8
        String str2 = Integer.toOctalString(n);
        System.out.println("He bat phan cua "+n+" la: "+str2);
        //chuyen doi sang co so 16
        String str3 = Integer.toHexString(n);
        System.out.println("He thap luc phan cua "+n+" la: "+str3);
        
    }

}

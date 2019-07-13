/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập một xâu ký tự. Đếm số từ của xâu ký tự đó.
 *
 * @author leodo0208
 */
public class OnTap7 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao mot xau chuoi: ");
        String str = in.nextLine();

        String[] arStr = str.split(" ");
        for (String item : arStr) {
            System.out.println(item);
        }
        System.out.print("So tu cua chuoi la: "+arStr.length);
    }
}

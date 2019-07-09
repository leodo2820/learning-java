/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *Nhập vào dãy số gồm n số tự nhiên
 * Tính tổng các số lẻ
 * @author leodo0208
 */
public class Btvn1c {
    public static void main(String[] args){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i<numbers.length;i++){
            System.out.print("Nhap vao so thu "+i+": ");
            numbers[i] = in.nextInt();
            if(numbers[i]%2!=0){
                sum += numbers[i];
            }
        }
        System.out.print("Day so da nhap la: ");
        for(int i:numbers){
            System.out.print(i+" ");
        }
        System.out.println("\nTong cua cac so le la: "+sum);
    }
    
}

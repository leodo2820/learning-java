/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *Nhập vào dãy số gồm n số tự nhiên
 * Hiển thị ra dãy số vừa nhập
 * @author DELL
 */
public class Btvn1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        int[] numbers = new int[n];
        for(int i = 0;i<numbers.length;i++){
            System.out.print("Nhap vao phan tu thu "+i+": ");
            numbers[i] = in.nextInt();
        } 
        System.out.print("Day so nguoi dung vua nhap la: ");
        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
}

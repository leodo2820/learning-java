/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CayThong {

    public static void main(String[] args) {
        int nKhoi;
        int nCot;
        int t;
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap vao so khoi: ");
        nKhoi = in.nextInt();
        System.out.print("Nhap vao so cot: ");
        nCot = in.nextInt();
        
        t = (nCot - 1) / 2;//vi tri cot chinh giua cua cay thong

        for (int khoi = 0; khoi < nKhoi; ++khoi) {
            System.out.print("");//Ve so tang cay

            for (int hang = 0; hang <= t ; ++hang)//Ve chi tiet so tang cay thong
            {
                System.out.print("\n");
                for (int cot = 0; cot < nCot; ++cot) {
                    if ((t - hang) < cot && (t + hang) > cot) {
                        System.out.print("0");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }

            }
        }
    }
}

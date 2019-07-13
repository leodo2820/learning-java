/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Tính cộng, trừ hai ma trận kích thước MxN bất kỳ
 *
 * @author leodo0208
 */
public class Btvn3 {

    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Nhap vao so hang cua ma tran: ");
            m = in.nextInt();
            System.out.print("Nhap vao so cot cua ma tran: ");
            n = in.nextInt();
        } while (m < 1 || n < 1);

        int a[][] = new int[m][n];//ma tran a
        int b[][] = new int[m][n];//ma tran b
        int c[][] = new int[m][n];//ma tran c la tong cua 2 ma tran a va b
        int d[][] = new int[m][n];//ma tran d la hieu cua 2 ma tran a va b
        System.out.print("Nhap phan tu cho ma tran a: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a [ " + i + " , " + j + " ] = ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.print("Nhap phan tu cho ma tran b: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("b [ " + i + " , " + j + " ] = ");
                b[i][j] = in.nextInt();
            }
        }
        System.out.println("Ma tran a: ");//in ra ma tran a
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma tran b: ");// in ra ma tran b
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("\n");
        }
        //tinh tong 2 ma tran
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //tinh hieu 2 ma tran
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Tong cua 2 ma tran :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Hieu cua 2 ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}



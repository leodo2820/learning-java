
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class NewClass2Cham1 {
    //Check xem so n co phai la so hoan thien
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        //Dieu kien de co so hoan thien la so nguyen duong khac 0
        do {
            System.out.print("Nhap vao so n: ");
            n = in.nextInt();
        } while (n <= 0);
        
        //Check dieu kien cua boolean, neu tra ve true thi se la so hoan thien
        boolean a = check(n);
        if (a) {
            System.out.println("So " + n + " la so hoan thien");
        } else {
            System.out.println("So " + n + " khong la so hoan thien");
        }
    }
    
    //Check dieu kien de co so hoan thien
    public static boolean check(int n) {
        int sum = 0;
        //Tinh tong cac uoc so cua n
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        //So sanh tong cac uoc so voi gia tri so nguyen n de xem co la so hoan hao hay khong
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * Nhập vào một mảng phần tử độ dài n bất kỳ, đảo ngược mảng vừa nhập vào
 *
 * @author leodo0208
 */
public class Btvn2 {

    public static void main(String[] args) {
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            numbers[i] = in.nextInt();
        }
        System.out.print("Day so vua nhap la: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        System.out.print("\nDay so sau khi bi doi cho la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}

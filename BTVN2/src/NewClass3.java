
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class NewClass3 {

    public static void main(String[] args) {
        
        int[] diem = new int[3];
        Scanner in = new Scanner(System.in);
        
        diem[0] = in.nextInt();
        diem[1] = in.nextInt();
        diem[2] = in.nextInt();
        
        for(int i = 0; i<diem.length;i++){
            System.out.println("Diem: "+diem[i]);
            
        } 
        double average = (diem[0]+diem[1]+diem[2])/3.0;
        System.out.print(average);
            

    }

}

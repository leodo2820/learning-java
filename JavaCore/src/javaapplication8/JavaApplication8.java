/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author DELL
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1 ){
            System.out.print("Null");
        } else {
            if (args[0].equals("-h")) {
                System.out.print("Hello,");
            } else if (args[0].equals("-g")) {
                System.out.print("Goodbye,");
            }
            for (int i = 1; i < args.length; i++) {
                System.out.print(" " + args[i]);
            }
            System.out.println("!");

        }
        // TODO code application logic here
    }
}

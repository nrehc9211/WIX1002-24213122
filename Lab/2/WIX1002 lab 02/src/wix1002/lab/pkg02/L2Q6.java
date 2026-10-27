/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg02;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram:");
        int M = (input.nextInt())/1000;
        System.out.print("Enter the initial temperature in Fahrenheit:");
        double initial = (input.nextDouble()-32.0)/1.8;
        System.out.print("Enter the initial temperature in Fahrenheit:");
        double last = (input.nextDouble()-32.0)/1.8;
        
        double Q = M*(last-initial)*4184;
        
        System.out.printf("The energy neede is %.6e\n",Q);
    }
}

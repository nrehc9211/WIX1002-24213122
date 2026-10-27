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
public class L2Q2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the car:");
        double P = input.nextDouble();
        System.out.print("Enter the Down Payment:");
        double D = input.nextDouble();
        System.out.print("Enter the Interest Rate %:");
        double R = input.nextDouble();
        System.out.print("Enter the Loan duration in year:");
        double Y = input.nextDouble();
        
        if(P<0 || D<0 ||D>P || R<0 || Y<=0 ){
            System.out.println("Invalid input.");
        }else{
            double M = (P-D)*(1+R*Y/100)/(Y*12);
        
            System.out.printf("Monthly Payment is %.2f%n",M);
        }
    }
}

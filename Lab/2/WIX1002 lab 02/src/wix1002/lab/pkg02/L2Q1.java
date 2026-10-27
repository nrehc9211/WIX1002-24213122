/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab.pkg02;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L2Q1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degree : ");
        double Fahrenheit = input.nextDouble();
        double Celcius = (Fahrenheit-32.0)/1.8;
        System.out.printf("%.2f F in Celcius is %.2f C", Fahrenheit, Celcius);
    }
    
}

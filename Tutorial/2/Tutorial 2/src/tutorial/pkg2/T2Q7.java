/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.pkg2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class T2Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in inch:");
        double inch = input.nextDouble();
        double meters = 0.0254*inch;
        System.out.printf("%.2f inches = %.2f meters",inch, meters);
    }
}

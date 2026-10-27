/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg03;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the center of a circle (0,0)");
        System.out.print("Enter the radius of circle:");
        double r = input.nextDouble();
        System.out.println("Enter the coordinate of a point (x,y)");
        System.out.print("Enter x:");
        double x = input.nextDouble();
        System.out.print("Enter y:");
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x*x+y*y);
        
        if(distance<=r){
            System.out.println("The point("+x+", "+y+") is INSIDE the circle.");
        }else{
            System.out.println("The point("+x+", "+y+") is OUTSIDE the circle.");
        }
        
        
    }
}

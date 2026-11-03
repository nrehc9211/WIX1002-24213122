/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.pkg3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class T3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int largest = 0;
        System.out.print("Enter integer a:");
        int a = input.nextInt();
        System.out.print("Enter integer b:");
        int b = input.nextInt();
        if( a > b){
            largest = a;
        }
        if( b > a){
            largest = b;
        }
        System.out.print("Enter integer c:");
        int c = input.nextInt();
        if( c > largest){
            largest = c;
        }
        
        
        System.out.println("The largest integer is "+ largest);
        
        
        
    }
}

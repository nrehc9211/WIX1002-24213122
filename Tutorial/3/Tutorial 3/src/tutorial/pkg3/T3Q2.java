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
public class T3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println(" ");
        System.out.println("a.");
        int num1 = 3;
        int num2 = 3;
        if(num1 == num2)
            System.out.println("Number 1 is equal to Number 2.");
        
        System.out.println(" ");
        System.out.println("b.");
        int x= 5;
        int y=4;
        int z=3;
        if(x > y && x > z){
            System.out.println("x is the largest number");
        }
        
        System.out.println(" ");
        System.out.println("c.");
        System.out.print("Enter word 1:");
        String s1 = input.next();
        System.out.print("Enter word 2:");
        String s2 = input.next();
        if(s1.equals(s2)){
            System.out.println("They are equal strings.");
        }else{
            System.out.println("They are not equal strings.");
        }
        
        System.out.println(" ");
        System.out.println("d.");
        int x_d =1;
        int y_d = -1;
        if(x_d>0 || y_d>0){
            System.out.println("Either x or y is positive");
        }
    }
}

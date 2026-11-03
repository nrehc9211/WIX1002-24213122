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
public class T3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is this year? : ");
        int year = input.nextInt();
        
        if(year%4 == 0){
            System.out.println("This year is leap year.");
        }else{
            System.out.println("This year is not leap year");
        }
    }
}

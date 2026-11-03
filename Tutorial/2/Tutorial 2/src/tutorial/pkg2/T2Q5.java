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
public class T2Q5 {
    public static void main(String[] args) {
        // a.
        double AMOUNT = 32.5;
        AMOUNT +=10;
        System.out.println("The amount is " + AMOUNT);
        
        //b.
        String chapter = "Summary";
        System.out.println(chapter);
        
        //c.
        int num = 0;
        num+=2;
        int num1=num;
        
        //d.
        double number = 3000;
        System.out.printf("%.2f%n",number);
        
        //e.
        String contact;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter contact: ");
        contact = keyboard.nextLine();
    }
}

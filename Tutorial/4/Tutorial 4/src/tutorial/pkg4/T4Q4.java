/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.pkg4;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class T4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String text = input.nextLine();
        input.next();
        int n = text.length();
        System.out.print(n);
        System.out.print("The reverse is ");
        for(int i = n; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab.pkg03;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Read two integar
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        //Read the operand as a string
        System.out.print("Enter the operand: ");
        String ch = input.next();
        char operand = ch.charAt(0);
        
        //Perform calculator
        switch(operand){
            case '+' -> System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            case '-' -> System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            case '*' -> System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            case '/' -> {
                if(num2==0){
                    System.out.println("Error: Division by 0 is not allowed");
                }else{
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
            }
            case '%' -> {
                if(num2==0){
                    System.out.println("Error: Division by 0 is not allowed");
                }else{
                    System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
                }
            }
            default -> System.out.println("Invalid operand");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial.pkg3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class T3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("a.");
        boolean result_a = (3*8 == 27);
        if(result_a){
            System.out.println("Yes!! 3x8=27");
        }else{
            System.out.println("No!! 3x8!=27");
        }
        
        System.out.println(" ");
        System.out.println("b.");
        System.out.print("Enter an integer:");
        int in = input.nextInt();
        if(in % 2 ==0){
            System.out.println("This number is an even number.");
        }else{
            System.out.println("This number is an odd number.");
        }
        
        System.out.println(" ");
        System.out.println("c.");
        System.out.print("Enter a character:");
        char ch = input.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("This character is capital letter.");
        }else if(Character.isLowerCase(ch)){
            System.out.println("This character is small letter.");
        }else{
            System.out.println("It is a symbol.");
        }
        
        System.out.println(" ");
        System.out.println("d.");
        System.out.print("Enter word 1:");
        String str1 = input.next();
        System.out.print("Enter word 2:");
        String str2 = input.next();
        if(str1.compareToIgnoreCase(str2) <=0){
            System.out.println(str1 + ", " + str2);
        }else{
            System.out.println(str2 + ", " + str1);
        }
        
        System.out.println(" ");
        System.out.println("e.");
        System.out.print("Enter day number:");
        int day = input.nextInt();
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    
    
    
}

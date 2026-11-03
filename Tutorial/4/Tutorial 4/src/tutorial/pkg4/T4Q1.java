/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial.pkg4;

/**
 *
 * @author User
 */
import java.util.*;
public class T4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("a.");
        int i=0;
        for(i=0;(i*i*i)<2000;i++){}
        System.out.println("The largest integer is "+(i-1));
        
        System.out.println(" ");
        System.out.println("b.");
        for(int j=1; j<=12;j++){
            System.out.println("The square of " + j + " is " + j*j);
        }
        
        System.out.println(" ");
        System.out.println("c.");
        Random r = new Random();
        for(int a=0;a<4;a++){
            for(int b =0;b<5;b++){
                System.out.print(r.nextInt(101)+ "   ");
            }
            System.out.printf("%n");
        }
        
        System.out.println(" ");
        System.out.println("d.");
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number sum to it from 1:");
        int num = input.nextInt();
        int sum =0;
        for(int n=1;n<=num;n++){
            sum = sum + n;
        }
        System.out.println("The sum from 1 is " + sum);
        
        
        System.out.println(" ");
        System.out.println("e.");
        double summ =0;
        for(double nom = 1; nom<=25; nom++){
            for(double denom = 25; denom>=1; denom++){
                summ = summ + (nom/denom);
            }
        }
        System.out.printf("The sum is %.2f%n", summ);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integar:");
        int num = in.nextInt();
        System.out.print("The factor are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(i==num){
                    System.out.print(i);
                }else{
                    System.out.print(i+", ");
                }
            }
        }
    }
    
}

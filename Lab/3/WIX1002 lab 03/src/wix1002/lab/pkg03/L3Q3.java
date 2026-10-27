/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        double volume = input.nextDouble();
        
        double commission = 0;
        
        if(volume <=100 && volume >=0){
            commission = volume*0.05;
        }else if(volume <= 500 && volume > 100){
            commission = volume*0.075;
        }else if(volume <= 1000 && volume > 500){
            commission = volume*0.1;
        }else if(volume > 1000){
            commission = volume*0.125;
        }else{
            System.out.println("Invalid volume");
        }
        
        System.out.printf("The commission is %.2f%n", commission);
    }
}

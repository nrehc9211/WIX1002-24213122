/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg02;

/**
 *
 * @author User
 */
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(10,51);
        int num2 = r.nextInt(10,51);
        int num3 = r.nextInt(10,51);
    
        int sum = num1+num2+num3;
        double avg = sum/3.0;
        
        System.out.println("num1 = " + num1 +", num2 = " + num2 +", num3 = " + num3);
        System.out.println("sum is "+sum);
        System.out.println("average is "+ avg);
        
    } 
}

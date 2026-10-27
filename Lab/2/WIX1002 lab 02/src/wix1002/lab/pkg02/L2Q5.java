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
public class L2Q5 {
    public static void main(String[] args) {
       Random r = new Random();
       int MAX = 10000;
       int Number = r.nextInt(MAX);
       int sum = 0;
       
       while(Number!=0){
           sum = sum + (Number%10);
           Number = Number/10;
       }
       
        System.out.println("The sum of all the random number digit is "+sum);
    }
}

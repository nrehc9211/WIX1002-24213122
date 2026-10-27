/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg02;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int second = input.nextInt();
        int minute = second / 60;
        int hours = minute /60;
        int minutes = minute%60;
        int seconds = second%60;
        
        System.out.println(second +" seconds is " + hours + " hours, "+ minutes + " minutes and "+ seconds + " seconds");
    }
}

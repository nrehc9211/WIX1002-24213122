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
public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the linear equation, ax+by=e, cx+dy=f");
        System.out.println("You just enter value of a to f, I calculate x and y");
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        System.out.print("Enter c:");
        int c = input.nextInt();
        System.out.print("Enter d:");
        int d = input.nextInt();
        System.out.print("Enter e:");
        int e = input.nextInt();
        System.out.print("Enter f:");
        int f = input.nextInt();

        if(a*d-b*c == 0){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("Value of x is"+ ((e*d-b*f)/(a*d-b*c)));
            System.out.println("Value of y is "+ ((a*f-e*c)/(a*d-b*c)));
        }
    }
}
